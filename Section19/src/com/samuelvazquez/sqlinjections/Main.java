package com.samuelvazquez.sqlinjections;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NullPointerException, SQLException{
        DBConnection dbConnection = new DBConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter email id: ");
        String id = scanner.nextLine();
        System.out.println("User id="+id);
        System.out.println("Please enter password to get details:");
        String pwd = scanner.nextLine();
        System.out.println("User password="+pwd);
        dbConnection.open();
        dbConnection.printUserData(id,pwd);
    }
}
