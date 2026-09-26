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
public class NumberComparisonLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean results;
        
        System.out.println("Input the first number : ");
        int first = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Input the second number : ");
        int second = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Input the third number : ");
        int third = scanner.nextInt();
        scanner.nextLine();
        
        if(first < second  && second < third){
          results = true;
        }else
            results = false;
        System.out.println("The result is: " + results);
   
    }
    
}
