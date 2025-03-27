package me.agus.casestudy06;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task){
        tasks.add(task);
    }

    public void removeTask(String task){
        tasks.remove(task);
    }

    public ArrayList<String> getAllTasks(){
        return tasks;
    }

    public int findTask(String task){
        if (tasks.contains(task)){
            return tasks.indexOf(task);
        } else {
            return -1;
        }
    }
}
