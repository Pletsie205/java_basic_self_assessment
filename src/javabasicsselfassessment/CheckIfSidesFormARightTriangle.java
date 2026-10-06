/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

import java.util.Scanner;

/**
 *
 * @author IT CENTER
 */
public class CheckIfSidesFormARightTriangle {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Input three integers(sides of a triangle)"); 
        int[] sides = {scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};
        
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        int side1 = 0;
        int side2 = 0;
        int largest = a;
        
        if(b > largest){
            largest = b;
            side1 = a;
            side2 = c;
        }
        if(c > largest){
            largest = c;
            
            side1 = a;
            side2 = b;
            }
        
         
        
        System.out.println("Do the given sides form a right triangle?"); 
        if((side1 * side1 )+ (side2 * side2) == (largest * largest)){ 
        System.out.println("Yes?"); 
        }else{ 
        System.out.println("No"); 
        } 
    } 
}
