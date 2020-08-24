package com.example.fanwenhao.base.serialize;

import java.io.*;

/**
 * @Date 2020/6/9 18:06
 * @Version 1.0
 */
public class SerializeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();
        user.setName("fanwenhao");
        user.setSex("男");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(baos);

        objectOutputStream.writeObject(user);
        byte[] bytes = baos.toByteArray();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        User user1 = (User) objectInputStream.readObject();
        System.out.println(user1.getName());
        System.out.println(bytes.length);
    }
}
