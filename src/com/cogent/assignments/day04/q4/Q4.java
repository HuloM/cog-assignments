package com.cogent.assignments.day04.q4;

import java.io.*;

public class Q4 {
    public static void main(String[] args) {
        BufferedReader buffer = new BufferedReader((new InputStreamReader(System.in)));
        FileReader reader = null;
        FileWriter writer = null;
        String filePath = new File("").getAbsolutePath();

        try {
            writer = new FileWriter(filePath + "/io.txt");

            System.out.println("please enter the text you would like to add to the file");
            String text = buffer.readLine();

            writer.write(text);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            assert writer != null;
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            reader = new FileReader(filePath + "/io.txt");

            int ch;
            while((ch = reader.read()) != -1)
                System.out.print((char)ch);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            assert reader != null;
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        File file = new File(filePath + "/io.txt");
        if(file.delete())
            System.out.println("\nfile deleted");
    }
}
