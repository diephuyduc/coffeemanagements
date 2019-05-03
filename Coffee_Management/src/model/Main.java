package model;

import employeePackage.LogIn;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         
         File dr = new File("C://Coffee Management");
         if(!dr.exists()){
        File dr1 = new File("C://Coffee Management");
        if (dr1.mkdirs()) {
	
}
         }
        LogIn start = new LogIn();
         start.aa(); 
         
    }
    
}
