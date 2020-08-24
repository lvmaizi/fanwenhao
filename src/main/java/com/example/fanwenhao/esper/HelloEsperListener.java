package com.example.fanwenhao.esper;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class HelloEsperListener  implements UpdateListener {
    public void update(EventBean[] arg0, EventBean[] arg1) {
        try {
            System.out.println("coder: name-"+arg0[0].get("name") + " age-"+arg0[0].get("age"));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
