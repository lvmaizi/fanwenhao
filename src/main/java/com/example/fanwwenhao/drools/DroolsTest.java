package com.example.fanwwenhao.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

public class DroolsTest {
    public static void main(String[] args) {
        KieContainer kContainer = null;
        try {
            KieServices ks = KieServices.Factory.get();
            kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-hello1");

            Message message1 = new Message(Message.MessageType.HI, "杨过");
            kSession.insert(message1);
            kSession.getAgenda().getAgendaGroup("group1").setFocus();
            System.out.println(kSession.fireAllRules());

            Message message3 = new Message(Message.MessageType.CHAT, "美羊羊");
            kSession.insert(message3);
            kSession.getAgenda().getAgendaGroup("group2").setFocus();
            System.out.println(kSession.fireAllRules());
            Collection collection = kSession.getObjects(Result.class::isInstance);
            System.out.println("ppp");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (kContainer != null) {
            }
        }
    }
}
