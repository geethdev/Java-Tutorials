/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q5;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Q5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter integer 1 : ");
        int myInt1 = input.nextInt();
        
        System.out.print("Enter integer 2 : ");
        int myInt2 = input.nextInt();
        
        if (myInt1 % myInt2 == 0)
        {
            System.out.println("Number is Divisible by 2");
        }
        else
        {
        System.out.println("Non divisible");
        }
    }
}
