/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q4;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Q4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int i;
        
        System.out.print("Enter integer number :");
        int num = input.nextInt();
        
        if (num == 0)
        {
            System.out.print("Enter integer number without zero");
        }
        else 
        {
            for(i = num; i >= 0; i--)
            {
                System.out.println(i);
            }
        }
        
       
    }
}
