package com.cogent.week02.day06.coding_assessment.mock_interview;

public class printEvenNum {
    public static void main(String[] args) {
        printEvenNum obj = new printEvenNum();

//        obj.printEven(new int[] {1,2,3,4,5,6,7,8,9,10});
        obj.printPrime(new int[] {1,2,3,4,5,6,7,8,9,10});

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        obj.printPrime(arr);
    }
    void printEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println("Num is even: " + arr[i]);
            }
        }
    }

    void printPrime(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(isPrime(arr[i])) {
                System.out.println("Num is prime: " + arr[i]);
            }
        }
    }

    boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
