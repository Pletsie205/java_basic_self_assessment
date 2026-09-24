/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class BinaryAddition {
    public static void main(String[] args){
        
        String binary1 = "10";
        String binary2 = "11";
        
        int number1 = Integer.parseInt(binary1,2);
        int number2 = Integer.parseInt(binary2,2);
        
        int sum = number1 + number2;
        
        
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(sum));
        
    }
    
}
