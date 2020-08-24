package com.example.fanwenhao;

import com.example.fanwenhao.drools.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DroolsTests {
    @Test
    public void aa(){
        KieContainer kContainer = null;
        System.out.println(KieServices.class.getResource("/"));
        try {
            KieServices ks = KieServices.Factory.get();
            kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-hello1");

            Message message1 = new Message(Message.MessageType.HI, "杨过");
            kSession.insert(message1);
            kSession.fireAllRules();

            Message message2 = new Message(Message.MessageType.GOODBYE, "姑姑");
            kSession.insert(message2);
            kSession.fireAllRules();

            Message message3 = new Message(Message.MessageType.CHAT, "美羊羊");
            kSession.insert(message3);
            kSession.fireAllRules();

            System.out.println("ii");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (kContainer != null) {
            }
        }
    }
}
