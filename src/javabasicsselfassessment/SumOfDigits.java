/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class SumOfDigits {
    public static void main(String[] args){
        int number = 700;
        int sum = 0;
        String numberAsString = String.valueOf(number);
        
        for (int i = 0; i < numberAsString.length(); i++) {
        sum += Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
