/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class HexadecimalToDecimalConverter {
    public static void main(String[] args){
        
        String numberInHexadecimal = "25";
        int numberInDecimal = Integer.parseInt(numberInHexadecimal,16);
       
        System.out.println("Equivalent decimal number is: " + numberInDecimal);
        
    }
}
