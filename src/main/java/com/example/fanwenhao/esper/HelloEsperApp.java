package com.example.fanwenhao.esper;

import com.espertech.esper.client.*;

public class HelloEsperApp {
    public static void main(String[] args) throws InterruptedException {
        EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider();
        EPAdministrator admin = epService.getEPAdministrator();
        System.out.println("start ....");
        //指定事件模型
        String coderModel = Coder.class.getName();

        //描述复杂事件
        String epl = "select name,salary,age from " + coderModel;
        EPStatement state = admin.createEPL(epl);

        //添加事后处理
        state.addListener(new HelloEsperListener());
        EPRuntime runtime = epService.getEPRuntime();

        //模拟事件发生
        for (int i = 0; i < 10; i++) {
            Coder coder = new Coder();
            coder.setName("coder"+i);
            coder.setAge(20+i);
            runtime.sendEvent(coder);
        }
    }
}
