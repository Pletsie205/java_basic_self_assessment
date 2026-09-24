/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class OctalToDecimalConverter {
    public static void main(String[] args){
        
        String numberInOctal = "10";
        
        int numberInDecimal = Integer.parseInt(numberInOctal,8);
        
        
        System.out.println("Octal number is: " + numberInDecimal);
        
    }
}
