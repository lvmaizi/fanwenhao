package com.example.fanwwenhao.common;

import com.google.common.base.Joiner;
import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.ZkClient;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.json.JSON;
import org.apache.dubbo.common.utils.UrlUtils;
import org.springframework.util.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Date 2019/12/27 14:13
 * @Version 1.0
 */
public class ZookeeperIpList {

    private String dataId = "/dubbo/com.books.dubbo.demo.api.GreetingService/providers:1.0.0";
    private URL CONSUMER_URL;
    private static final Joiner j = Joiner.on("|").useForNull("nil");

    public final List<String> getIpList() {
        return ipList;
    }

    private volatile List<String> ipList = new ArrayList<String>();

    //对获取的列表内容进行过滤
    private static List<URL> toUrlsWithoutEmpty(URL consumer, List<String> providers) {
        List<URL> urls = new ArrayList<URL>();
        String s = URL.decode(providers.get(0));
        if (providers != null && providers.size() > 0) {
            urls = providers.stream().map(provider -> URL.decode(provider)).filter(provider -> provider.contains("://"))
                    .map(provider -> URL.valueOf(provider)).filter(url -> url.getHost().equals("192.168.73.51"))
                    .collect(Collectors.toList());
        }

        return urls;
    }


    // 解析服务提供者地址列表为ip:port格式
    private void parseIpList(List<String> ipSet) {

        List<URL> urlList = toUrlsWithoutEmpty(CONSUMER_URL, ipSet);
        final List<String> ipListTemp = urlList.stream().map(url -> url.getAddress()).map(endPoint->endPoint.split(":")[0]).collect(Collectors.toList());
        this.ipList = ipListTemp;

    }

    public void init(String zkServerAddr, String zkGroup, String dataId, String serviceGroup) {
        // 1.参数校验
        Assert.notNull(zkServerAddr, "zkServerAddr is null.");
        Assert.notNull(dataId, "dataId is null.");
        Assert.notNull(dataId, "zkGroup is null.");
        Assert.notNull(dataId, "serviceGroup is null.");

        // 2.拼接订阅的path
        String[] temp = dataId.split(":");
        if (temp.length != 2) {
            throw new RuntimeException("dataId is illegal");
        }

        this.dataId = "/" + zkGroup + "/" + temp[0] + "/providers";
        String consumeUrl = "consumer://192.168.73.51";
        CONSUMER_URL = URL.valueOf(consumeUrl);

        // 3.开启zk，订阅path路径下服务提供者信息，并添加监听器
        System.out.println(j.join("init zk ", zkServerAddr, this.dataId, consumeUrl));
        ZkClient zkClient = new ZkClient(zkServerAddr);
        List<String> list1 = zkClient.getChildren(this.dataId);
        parseIpList(list1);
        List<String> list = zkClient.subscribeChildChanges(this.dataId, new IZkChildListener() {

            @Override
            public void handleChildChange(String parentPath, List<String> currentChilds) throws Exception {
                // 3.1解析服务提供者地址列表
                parseIpList(currentChilds);

                System.out.println("_____________________________");

                try {
                    System.out.println((j.join("ipList changed:", JSON.json(ipList))));
                } catch (IOException e) {
                }
            }
        });

        // 解析服务提供者ip列表
        parseIpList(list);

    }

    public static void main(String[] a) throws InterruptedException {
        ZookeeperIpList zk = new ZookeeperIpList();
        zk.init("dev.zk-ha.yaoxinhd.io:2181", "dubbo", "io.kyoto.risk.des.modules.mgmt.facade.DesKbaseFacade:1.0.0", "dubbo");

        try {
            System.out.println((j.join("parseIpList", JSON.json(zk.getIpList()))));
        } catch (IOException e) {
        }
        Thread.currentThread().join();

    }
}
