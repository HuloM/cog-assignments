package com.cogent.assignments.Day01.Q9;

public class q9 {

    public static void main(String[] args) {
        int[] A = new int[] {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};

        int[] B = calculateSumAvgSmallest(A);

        for(int num : B) {
            System.out.println(num);
        }
    }

    static int[] calculateSumAvgSmallest(int[] arr) {
        int sum = 0;
        int smallest = arr[0];

        for (int i = 0; i < 15; i++) {
            sum += arr[i];
            if (arr[i] < smallest)
                smallest = arr[i];
        }

        arr[15] = sum;
        arr[16] = sum / 15;
        arr[17] = smallest;
        return arr;
    }

}
