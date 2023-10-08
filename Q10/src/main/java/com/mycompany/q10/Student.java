/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q10;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Student {
    
    public void StudentInfo()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Your Name : ");
        String name = input.next();
        
        System.out.println("Enter Your Degree : ");
        String degree = input.next();
        
        System.out.println(name + "" + degree);
    }
    
}
