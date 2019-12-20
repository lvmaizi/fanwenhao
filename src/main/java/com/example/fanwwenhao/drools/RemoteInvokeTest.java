package com.example.fanwwenhao.drools;

import org.kie.api.KieServices;
import org.kie.api.command.Command;
import org.kie.api.command.KieCommands;
import org.kie.api.runtime.ExecutionResults;
import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.RuleServicesClient;
import work.bench.apv_model.Cust;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @Date 2019/12/9 9:35
 * @Version 1.0
 */
public class RemoteInvokeTest {
    public static final String SERVER_URL = "http://localhost:8080/kie-server/services/rest/server";
    public static final String PASSWORD = "admin";
    public static final String USERNAME = "admin";
    public static final String KIE_CONTAINER_ID = "test_loacl_1.0.0";
    public static final String KIE_SESSION_ID = "mytest1";

    public static void main(String[] args) throws IOException {


        // KisService 配置信息设置
        KieServicesConfiguration kieServicesConfiguration =
                KieServicesFactory.newRestConfiguration(SERVER_URL, USERNAME, PASSWORD, 10000L);
        kieServicesConfiguration.setMarshallingFormat(MarshallingFormat.JSON);

        // 创建规则服务客户端
        KieServicesClient kieServicesClient = KieServicesFactory.newKieServicesClient(kieServicesConfiguration);
        RuleServicesClient ruleServicesClient = kieServicesClient.getServicesClient(RuleServicesClient.class);

        // 规则输入条件


        // 命令定义，包含插入数据，执行规则
        KieCommands kieCommands = KieServices.Factory.get().getCommands();
        List<Command<?>> commands = new LinkedList<>();

        //插入数据
        Cust cust = new Cust();
        cust.setName("fanwenhao");
        commands.add(kieCommands.newInsert(cust, "cust"));

        commands.add(kieCommands.newFireAllRules());
        ServiceResponse<ExecutionResults> results = ruleServicesClient.executeCommandsWithResults(KIE_CONTAINER_ID,
                kieCommands.newBatchExecution(commands, KIE_SESSION_ID));

        // 返回值读取
        Cust value = (Cust) results.getResult().getValue("cust");
        System.out.println(value.toString());
    }
}
