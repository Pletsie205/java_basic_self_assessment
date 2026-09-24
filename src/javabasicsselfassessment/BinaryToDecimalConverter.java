/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class BinaryToDecimalConverter {
    public static void main(String[] args){
        
        String binary1 = "100";
        
        int numberInDecimal = Integer.parseInt(binary1,2);
        
        System.out.println("decimal number: " + numberInDecimal);
        
    }
}
