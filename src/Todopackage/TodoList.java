package Todopackage;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.ListIterator;

public class TodoList {
    private List todoList;

    public TodoList() {
        this.todoList = new LinkedList();
    }
    
    public void addTask(String name,Date deadline){
        this.todoList.add(new Task(name,deadline) );
    }
    
    public void removeTask(int index){
        this.todoList.remove(index);
    }
    
    public void sortTasks(){
        Collections.sort(todoList);
    }
    
    public void showList(){
        ListIterator itr =this.todoList.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.nextIndex()+1+". "+itr.next());
        }
    }
}
