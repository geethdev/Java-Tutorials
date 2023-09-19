/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q7;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Q7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter string : ");
        String myString = input.next();
        int count = myString.length();
        
      
        System.out.println( "Character count is : " + count);
    }
}
