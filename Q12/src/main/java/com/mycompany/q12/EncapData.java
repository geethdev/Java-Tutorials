/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q12;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class EncapData {
    private int radius;
    private double PI = 3.14;
    private double area;
    private double circumference;

    public void SetRadius(int radiusFromUser) {
        this.radius = radiusFromUser;
    }

    public double GetArea(){
        area = radius * radius * PI;
        return area;
    }

    public double GetCircumference(){
        circumference = PI*2*radius;
        return circumference;
    }
}