package com.cogent.week02.Day06.coding_assessment.taskManager;

import java.util.Scanner;

public class TodoManagerApp {

    int option = 1;
    static Task[] tasks;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please chose how many tasks you would like the be able to have");
        int size = sc.nextInt();
        tasks = new Task[size];

        TodoManagerApp manager = new TodoManagerApp();
        TaskDAO dao = new TaskDAO();

        while (manager.option > 0) {
            manager.option = manager.pickOption();
            switch (manager.option) {
                case 1 -> dao.create();
                case 2 -> dao.update();
                case 3 -> dao.delete();
                case 4 -> dao.read();
                default -> {
                }
            }
        }
    }

    int pickOption() {
        System.out.println("*****Menu******");
        System.out.println("1 - Adding a new task");
        System.out.println("2 - Updating a task");
        System.out.println("3 - Deleting a new Task");
        System.out.println("4 - Searching a new task");
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
