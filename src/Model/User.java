package Model;

public class User {

    private int idUser;
    private String  firstname ;
    private String  name ;
    private String email;
    private String role;

    public User() {
    }

    public User(String firstname, String name, String email, String role) {
        this.firstname = firstname;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String first_name) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
