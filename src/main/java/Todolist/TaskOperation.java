/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Todolist;

import java.util.ArrayList;
import java.util.List;

public class TaskOperation {
    
    private Integer id = 0;
    
//    Map<Integer, Task> taskMap = new HashMap<Integer, Task>();
//    Map<Integer, Task> completeTaskMap = new HashMap<Integer, Task>();

    List<Task> taskList = new ArrayList<>(); 
    List<Task> taskCompleteList = new ArrayList<>(); 
    
      Task task;
      
    public TaskOperation(){
        
    }
    
    public void saveTask(Task task2){
        taskList.add(task2);
    }
    
    public void deleteTask(Task tas){
        if(taskList.isEmpty())
            System.out.println("Map is empty");
        else{
            taskList.remove(tas);
        }
    }
    
    public void completeTask(Task task2){
        if(taskList.contains(task2))
            taskCompleteList.add(task2);
        else
            System.out.println("No task found");
    }
    
    
    //seters and getters
    
     public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public boolean compareTaskList(Task task){
        if(taskList.contains(task))
            return true;
        else
            return false;
    }
    
    public boolean compareTaskCompleteList(Task task){
        if(taskCompleteList.contains(task))
            return true;
        else
            return false;
    }
}