package com.cogent.assignments.day04.q1;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        copyFile(args[0], args[1]);
    }

    public static void copyFile(String source, String destination) {
        File f = new File(source);
        if(!f.exists()) {
            System.out.println("Source file does not exist");
            return;
        }
        FileWriter writer = null;
        FileReader reader = null;
        BufferedReader buffer = new BufferedReader((new InputStreamReader(System.in)));
        StringBuilder text = new StringBuilder();
        try {
            reader = new FileReader(source);

            int ch;
            while((ch = reader.read()) != -1)
                text.append((char)ch);

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
        try {
            writer = new FileWriter(destination);

            writer.write(text.toString());

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
    }

}
