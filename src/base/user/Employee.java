package base.user;

public class Employee extends  User{
    private String department ;
    
    public Employee(String name, String email,String department) {
        super(name, email);
        this.department = department;
    }
}
