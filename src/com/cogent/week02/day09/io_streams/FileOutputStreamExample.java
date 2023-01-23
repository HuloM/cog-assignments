package com.cogent.week02.day09.io_streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
?  taking reading input from a file and writing it to another file
*/
public class FileOutputStreamExample {
    public static void main(String[] args) {
        FileInputStream stream = null;
        FileOutputStream oStream = null;
        String filePath = new File("").getAbsolutePath();
        try {
            stream = new FileInputStream(new File(filePath+ "/HW.txt"));
            oStream = new FileOutputStream(filePath + "/hw2.txt");
            int i;
            while ((i = stream.read()) != -1) {
                oStream.write(i);
            }
            System.out.println("File copied");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                assert stream != null;
                stream.close();
                assert oStream != null;
                oStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
