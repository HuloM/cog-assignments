package com.cogent.week02.day09.io_streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/*
? reads the different bytes from a file and prints them out
*/
public class File_In_Stream {
    public static void main(String[] args) {
        FileInputStream stream = null;
        String filePath = new File("").getAbsolutePath();
        try {
            stream = new FileInputStream(new File(filePath + "/HW.txt"));
            System.out.println("File opened");
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                assert stream != null;
                stream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
