package com.cogent.week02.day08.exceptions_practice;

public class try_catch {
    public static void main(String[] args) {
        try {
            String age = args[0];
            System.out.println(age);

            int newAge = Integer.parseInt(age);
            System.out.println(newAge);

            int bonus = newAge / (newAge - 12);
            System.out.println(bonus);


//            String str = null;
            String str = "test";
            System.out.println(str.equals("test"));

            String str2 = "hello";
//            System.out.println(str2.charAt(6));
            Class.forName("com.cogent.week02.day08.Day08");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred & handled");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred & handled");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred & handled");
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred & handled");
            System.out.println(e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred & handled");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred & handled");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("unexpected Exception occurred & handled");
        } finally {
            System.out.println("this is the finally block");
        }
        System.out.println("Program ends");
    }
}
