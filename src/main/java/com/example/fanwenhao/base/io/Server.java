package com.example.fanwenhao.base.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Date 2020/6/9 13:43
 * @Version 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9090);
        int j;
        while (true){
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            while ((j = inputStream.read()) != -1){
                System.out.println(j);
            }
        }
    }

}
