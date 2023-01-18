package com.cogent.assignments.Day02.Q3;


public class TestMedicine {
    public static void main(String[] args) {
        Medicine[] medicineCabinet = new Medicine[10];

        for (int i = 0; i < 10; i++) {
            int medicineType = (int) Math.floor(Math.random()*3);
            switch (medicineType) {
                case 0 -> medicineCabinet[i] = new Tablet("tablet Inc", "12345 NE drive");
                case 1 -> medicineCabinet[i] = new Syrup("Syrupot", "54321 NE drive");
                case 2 -> medicineCabinet[i] = new Ointment("Oinkment", "25314 NE drive");
                default -> System.out.println("unexpected error");
            }
        }
        for(Medicine medicine: medicineCabinet) {
            medicine.displayLabel();
            System.out.println("this medicine is a " + medicine.getClass().getSimpleName());
            System.out.println("");
        }
    }
}
