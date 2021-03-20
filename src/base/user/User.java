package base.user;

public class User  {

    private String registered_email;
    private String name;


    public User(String name,String email) {
        this.name = name;
        this.registered_email = email;
    }

    public void registerEmail(String email) {
        this.registered_email = email;
    }

    public String getRegistered_email() {
        return registered_email;
    }

    @Override
    public String toString() {
        return "User{" + "registered_email=" + registered_email + ", name=" + name + '}';
    }
}
