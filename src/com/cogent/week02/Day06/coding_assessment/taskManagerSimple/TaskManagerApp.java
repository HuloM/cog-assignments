package com.cogent.week02.Day06.coding_assessment.taskManagerSimple;

import java.util.Scanner;

public class TaskManagerApp {

    static Task task1;
    static Task task2;
    static Task task3;

    String name;
    int option = 1;

    public static void main(String[] args) {
        TaskManagerApp manager = new TaskManagerApp();
        Scanner sc = new Scanner(System.in);
        TaskDAO dao = new TaskDAO();


        System.out.println("What is your name?");
        manager.name = sc.next();

        task1 = dao.create();
        task2 = dao.create();
        task3 = dao.create();

        while (manager.option > 0) {
            manager.option = manager.pickOption();
            switch (manager.option) {
                case 1 -> System.out.println(manager.name);
                case 2 -> dao.printInOrder(true);
                case 3 -> dao.printInOrder(false);
                case 4 -> dao.printReapeated();
                default -> {
                }
            }
        }
    }

    int pickOption() {
        System.out.println("*****Menu******");
        System.out.println("1 - Print your name");
        System.out.println("2 - show increasing order of tasks");
        System.out.println("3 - Show decreasing order of tasks");
        System.out.println("4 - show repeating tasks");
        System.out.println("0 - Exit Application");
        System.out.println("Please enter your choice!");

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        while (choice < 1 || choice > 4) {
            System.out.println("That is not a valid option, please choose from 0-4");
            choice = sc.nextInt();
        }
        return choice;
    }
}
