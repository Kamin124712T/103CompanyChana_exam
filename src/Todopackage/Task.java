package Todopackage;

public class Task implements Comparable<Task>{
    private String name;
    private Date deadline;

    public Task(String name, Date deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public Date getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task{" + name + deadline + '}';
    }

    @Override
    public int compareTo(Task o) {
       return this.deadline.compareTo(o.deadline);
    }
    
    
}
