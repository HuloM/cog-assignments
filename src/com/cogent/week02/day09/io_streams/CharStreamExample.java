package com.cogent.week02.day09.io_streams;

import java.io.*;

public class CharStreamExample {

    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;
        String filePath = new File("").getAbsolutePath();
        try {
            reader = new FileReader(filePath + "/HW.txt");
            writer = new FileWriter(filePath + "/hw2.txt");

            int ch;
            while((ch = reader.read()) != -1)
                writer.write(ch);

            System.out.println("Date copied");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                assert reader != null;
                reader.close();
                assert writer != null;
                writer.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
