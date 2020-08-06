package com.example.fanwwenhao.base.io;

import java.io.File;

public class FileTraverse {
    public static void main(String[] args) {
        File file = new File("D:/data/");
        System.out.println(fileSize(file));
    }
    public static long fileSize(File file){
        long size = 0;
        if(file.exists()){
            if(file.isFile()){
                System.out.println("文件名："+file.getName()+"文件大小:"+file.length());
                return file.length();
            }else if(file.isDirectory()){
                System.out.println("目录名："+file.getName()+"目录大小："+file.length());
                File[] files = file.listFiles();
                for (File f:files){
                    size = size + fileSize(f);
                }
            }
        }
        return size;
    }
}
