package com.cogent.week02.day06.coding_assessment.task_manager_simple;

import java.util.Scanner;

public class TaskDAO {
    Task create() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose an id for the task");
        int id = sc.nextInt();

        System.out.println("Please choose a name for the task");
        String name = sc.next();

        return new Task(id, name);
    }

    void printInOrder(Boolean isInc) {
        if(isInc) {
            System.out.println(TaskManagerApp.task1);
            System.out.println(TaskManagerApp.task2);
            System.out.println(TaskManagerApp.task3);
        } else {
            System.out.println(TaskManagerApp.task3);
            System.out.println(TaskManagerApp.task2);
            System.out.println(TaskManagerApp.task1);
        }
    }

    void printReapeated() {
        if (TaskManagerApp.task1.getTaskName().equals(TaskManagerApp.task2.getTaskName()) && TaskManagerApp.task2.getTaskName().equals(TaskManagerApp.task3.getTaskName()))
            System.out.println("all tasks are are repeating:\n" +
                    TaskManagerApp.task1.toString() + "\n" +
                    TaskManagerApp.task2.toString() + "\n" +
                    TaskManagerApp.task3.toString());
        else if (TaskManagerApp.task1.getTaskName().equals(TaskManagerApp.task2.getTaskName()))
            System.out.println("task 1 and task 2 are repeating:\n" +
                    TaskManagerApp.task1.toString() + "\n " +
                    TaskManagerApp.task2.toString());
        else if (TaskManagerApp.task1.getTaskName().equals(TaskManagerApp.task3.getTaskName()))
            System.out.println("task 1 and task 3 are repeating:\n" +
                    TaskManagerApp.task1.toString() + "\n" +
                    TaskManagerApp.task3.toString());
        else if (TaskManagerApp.task2.getTaskName().equals(TaskManagerApp.task3.getTaskName()))
            System.out.println("task 2 and task 3 are repeating:\n" +
                    TaskManagerApp.task2.toString() + "\n" +
                    TaskManagerApp.task3.toString());
    }
}
