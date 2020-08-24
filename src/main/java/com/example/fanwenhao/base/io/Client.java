package com.example.fanwenhao.base.io;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Date 2020/6/9 13:52
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",9090);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello".getBytes());
//        while (true){}
        outputStream.close();
    }
}
