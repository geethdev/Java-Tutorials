/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Q3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Integer : ");;
        int myInteger1 = input.nextInt ();
        
        System.out.print("Enter Integer : ");;
        int myInteger2 = input.nextInt ();
        
        if (myInteger1 > myInteger2)
        {
            System.out.println("Maximum value is :" + myInteger1);
        }
        else 
        {
            System.out.println("Maximum value is :" + myInteger2);
        }
    }
}
