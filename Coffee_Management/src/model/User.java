package model;

public class User {
 public  String idUsers;
public	String fullname;
public	String address;
public	String email;
public	String username;
public	String password;
public	String phonenumber;

    public User(String idUsers, String fullname, String address, String email, String username, String password, String phonenumber) {
        this.idUsers = idUsers;
        this.fullname = fullname;
        this.address = address;
        this.email = email;
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
    }
    
}
