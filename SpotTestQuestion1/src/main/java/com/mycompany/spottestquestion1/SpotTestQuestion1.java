/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spottestquestion1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class SpotTestQuestion1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name : ");;
        String name = input.next ();
        
        System.out.print("Enter your age : ");;
        int age = input.nextInt ();
        
        if(age >= 18)
            
            System.out.println( name +"" + age );

    }
}
