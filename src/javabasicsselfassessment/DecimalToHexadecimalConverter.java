/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class DecimalToHexadecimalConverter {
    public static void main(String[] args){
        
        int numberInDecimal = 15;//Integer.parseInt(binary2,2);
        
        String numberInHexadecimal = Integer.toHexString(numberInDecimal);
        System.out.println("Hexadecimal number is: " + numberInHexadecimal);
        
    }
}
