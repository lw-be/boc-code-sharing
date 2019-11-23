package com.example;

import java.io.*;

public class TestCopy {
    public static void copy(File srcFile, File targetFile) {
        if (srcFile == null || targetFile == null) {
            System.out.println("文件为null");
            return;
        }
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(targetFile);
            byte[] b = new byte[1024];
            int len = 0;
            while((len=in.read(b)) != -1) {
                // 去除缓存区数据，取出后立马将数据写到另一个文件
                out.write(b, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // 无论out是否关闭，都应关闭in
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("copy finish");
    }

    public static void copyByJava7(File srcFile, File targetFile) {
        if (srcFile == null || targetFile == null) {
            System.out.println("文件为null");
            return;
        }
        try (InputStream in = new FileInputStream(srcFile);
                OutputStream out = new FileOutputStream(targetFile)) {
            byte[] b = new byte[1024];
            int len = 0;
            while((len=in.read(b)) != -1) {
                // 去除缓存区数据，取出后立马将数据写到另一个文件
                out.write(b, 0, len);
            }
        } catch (Exception e) {
            System.out.println("error happen");
        }
        System.out.println("copyByJava7 finish");
    }
}
