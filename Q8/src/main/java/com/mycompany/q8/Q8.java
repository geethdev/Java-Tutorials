/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q8;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Q8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int[] myArray = new int[10];
   
        for( int i=0 ; i<10; i++) 
        {
            System.out.print("Enter a number : ");
            myArray[i] =  input.nextInt(); 
        }
        
        int max = myArray[0];
        for (int i=0; i<10; i++) 
        {
            if (max < myArray[i])
                max = myArray[i];  
        }    
                        
        System.out.print("Maximun number is : " + max);
        
    }
}
