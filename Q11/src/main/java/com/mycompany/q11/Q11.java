/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q11;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Q11 {

    public static void main(String[] args) {
        
        Scanner objAge = new Scanner (System.in);
        
        System.out.println("Enter your age : ");
        int age = objAge.nextInt();
        
        Student obj1 = new Student();
        obj1.checkEligibility(age);
    }
}
