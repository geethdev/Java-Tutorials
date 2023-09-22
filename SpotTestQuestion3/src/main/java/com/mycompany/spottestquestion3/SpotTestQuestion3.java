/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spottestquestion3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class SpotTestQuestion3 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Define the length of the arrays
        int length = 5;

        // Initialize arrays
        int[] array1 = new int[length];
        int[] array2 = new int[length];

        // Input elements for the first array
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Input elements for the second array
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Combine the two arrays into one
        int[] combinedArray = new int[length * 2];
        System.arraycopy(array1, 0, combinedArray, 0, length);
        System.arraycopy(array2, 0, combinedArray, length, length);

        // Find the minimum and maximum values
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int value : combinedArray) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        // Display the combined array, minimum, and maximum values
        System.out.println("Combined Array:");
        for (int value : combinedArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nMinimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}
