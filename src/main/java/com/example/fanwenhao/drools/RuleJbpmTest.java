package com.example.fanwenhao.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @Date 2020/1/8 10:30
 * @Version 1.0
 */
public class RuleJbpmTest {
    public static void main(String[] args) {
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-process");

            kSession.startProcess("jbpm.NewProcess");
            kSession.fireAllRules();
            kSession.dispose();
            //System.out.println(person.getName()+"的年龄是："+person.getAge());
        }catch (Exception e){}
    }
}
