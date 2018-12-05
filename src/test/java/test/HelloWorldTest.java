package test;

import Todolist.HelloWorld;
import Todolist.Task;
import Todolist.TaskOperation;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private HelloWorld subject;

	@Before
	public void setup() {
		subject = new HelloWorld();
	}

        
    @Test
    public void saveTaskTest(){
        
        Task task = new Task("Comer","2211","otro","high","Emilio");
	            Task task2 = new Task("Comer","2211","otro","high","galindo");
        TaskOperation tas = new TaskOperation();
        
        tas.saveTask(task);
        
        assertTrue(tas.compareTaskList(tas2));
        
    }
    
    @Test
    public void deleteTaskTest(){
        
        Task task = new Task("Comer","2211","otro","high","Emilio");
        TaskOperation to = new TaskOperation();
        
        to.saveTask(task);
        
        assertTrue(to.compareTaskList(task));
         
         to.deleteTask(task);
        
         assertFalse(to.compareTaskList(task));
    }
    
    @Test
    public void completeTaskTest(){
        
        Task task = new Task("Comer","2211","otro","high","Emilio");
        TaskOperation to = new TaskOperation();
        
        to.completeTask(task);
        
        assertFalse(to.compareTaskCompleteList(task));
         
        to.saveTask(task);
        
        to.completeTask(task);
        
        assertTrue(to.compareTaskCompleteList(task));
    }
}
	

