package dellatan.mcm.edu.kyper;

public class User {
    private String userID;
    private String userPassword;

    public User(String id, String password) {
        userID = id;
        userPassword = password;
    }

    public String getUserID(){
        return userID;
    }
    public void setUserID(String userID){
        this.userID = userID;
    }


    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }
}
