package com.cogent.week02.day06.coding_assessment.task_manager;

import java.util.Scanner;

class TaskDAO {

    int taskCount = 0;
    int taskDeleted = -1;
    void create() {
        if (taskDeleted > -1) {
            TodoManagerApp.tasks[taskDeleted] = createUpdateTask();
            taskDeleted = -1;
        }
        else {
            TodoManagerApp.tasks[taskCount] = createUpdateTask();
            taskCount++;
        }
    }

    void delete() {
        int index = selectIndex();
        if (TodoManagerApp.tasks[index] != null) {
            TodoManagerApp.tasks[index] = null;
            taskDeleted = index;
        }
        else
            System.out.print("there is no task at this index");
    }

    void update() {
        int index = selectIndex();
        TodoManagerApp.tasks[index] = createUpdateTask();
    }

    void read() {
        int index = selectIndex();
        if(TodoManagerApp.tasks[index] != null) {
            System.out.println(TodoManagerApp.tasks[index].toString());
        }
    }
    
    int selectIndex() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose the index for the task you want to read");
        int index = sc.nextInt() - 1;
        index = index >= 0 ? index: index + 1;

        return index;
    }

    Task createUpdateTask() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose an id for the task");
        int id = sc.nextInt();

        System.out.println("Please choose a name for the task");
        String name = sc.next();

        return new Task(id, name);
    }
}
