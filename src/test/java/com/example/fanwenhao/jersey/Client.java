package com.example.fanwenhao.jersey;

import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {


        // 1. set connection pool，default connection Manager has bug, not close
        // 2. baidu bgw close idle connetion > 90s, connection pool must drop idl connection itself to fix TCP
        // retransmition bug
        // 3. ? keepalive


        javax.ws.rs.client.Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://127.0.0.1:8080/test");
        Invocation.Builder invocation = webTarget.request();
        Response response = invocation.get();
        String rs = response.readEntity(String.class);
        System.out.println(rs);
    }
}
