package Controller;

import Model.User;

public class UserController {

    private User modelUser;

    public UserController(User modelUser) {
        this.modelUser = modelUser;
    }

    public void setUserFirstName(String firstname){
        modelUser.setFirstname(firstname);
    }

    public String getUserFirstname(){
        return modelUser.getFirstname();
    }

    public void setUserName(String name){
        modelUser.setName(name);
    }

    public String getUserName(){
        return modelUser.getName();
    }

    public void setUserEmail(String email){
        modelUser.setEmail(email);
    }

    public String getUserEmail(){
        return modelUser.getEmail();
    }

    public void setUserRole(String role){
        modelUser.setRole(role);
    }

    public String getUserRole(){
        return modelUser.getRole();
    }


}
