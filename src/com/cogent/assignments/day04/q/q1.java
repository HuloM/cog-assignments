package com.cogent.assignments.day04.q;

import java.io.*;
import java.util.StringTokenizer;

public class q1 {
    public static void main(String[] args) {
        FileReader reader = null;
        String filePath = new File("").getAbsolutePath();
        try {
            reader = new FileReader(filePath + "/cogent.txt");

            int i;
            String str = "";

            while((i = reader.read()) != -1)
                str += (char)i;

            StringTokenizer token = new StringTokenizer(str);

            System.out.println(token.countTokens());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
