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
public class SumDigitsToSingleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input a positive integer: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;
        
       while(number >= 10){
        sum += number % 10;
       
       number = number/10;
       if(number < 10){
        sum += number;
       }
       }
       System.out.println(sum);
    }
}
