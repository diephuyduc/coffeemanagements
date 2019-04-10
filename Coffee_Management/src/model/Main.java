package model;

import employeePackage.LogIn;
import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrator
 */
public class Main {
public static String url = "jdbc:mysql://localhost:3306/coffee?useUnicode=yes&characterEncoding=UTF-8";
public static String usernameSQL = "root";
public static String passwordSQL ="";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         LogIn start = new LogIn();
         start.aa();
         
    }
    
}
