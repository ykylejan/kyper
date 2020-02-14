package dellatan.mcm.edu.kyper;

public class User {
    private String userName;
    private int userID;
    private String userPassword;

    private String userGoogleMail;

    private String userAddName;
    private String userAddPassword;

    private String userEmail;



    public User(String name, int id, String password, String googlemail ,String addname, String addpassword, String email) {
        userName = name;
        userID = id;
        userPassword = password;
        userGoogleMail = googlemail;
        userAddName = addname;
        userAddPassword = addpassword;
        userEmail = email;
    }


    public String getUserName() {
        return userName;
    }
    public void setUserName() {
        this.userName = userName;
    }


    public int getUserID(){
        return userID;
    }
    public void setUserID(int userID){
        this.userID = userID;
    }


    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }


    public String getUserGoogleMail() {
        return userGoogleMail;
    }
    public void setUserGoogleMail(String userGoogleMail) {
        this.userGoogleMail = userGoogleMail;
    }


    public String getUserAddName(){
        return userAddName;
    }
    public void setUserAddName (String userAddName){
        this.userAddName = userAddName;
    }


    public String getUserAddPassword() {
        return userAddPassword;
    }
    public void setUserAddPassword(String userAddPassword) {
        this.userAddPassword = userAddPassword;
    }


    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


}
