package com.cogent.week02.day09.serializations;

import java.io.*;

public class TestSerialization {

    static String filePath = new File("").getAbsolutePath();
    public static void main(String[] args) {
        serializeEmployee();
        deserializeEmployee();
    }

    private static void serializeEmployee() {
        FileOutputStream oStream = null;
        ObjectOutputStream objOutStream = null;
        try {
            oStream = new FileOutputStream(filePath + "/emp.ser");
            objOutStream = new ObjectOutputStream(oStream);

            Employee emp = new Employee(1, "john", 1.2);

            objOutStream.writeObject(emp);
            System.out.println("emp saved");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                assert oStream != null;
                oStream.close();
                assert objOutStream != null;
                objOutStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    private static void deserializeEmployee() {
        FileInputStream iStream = null;
        ObjectInputStream objInStream = null;
        try {
            iStream = new FileInputStream(filePath + "/emp.ser");
            objInStream = new ObjectInputStream(iStream);

            Object obj = objInStream.readObject();
            Employee emp = (Employee) obj;
            System.out.println(emp.toString());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                assert iStream != null;
                iStream.close();
                assert objInStream != null;
                objInStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
