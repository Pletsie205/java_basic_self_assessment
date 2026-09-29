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
public class CountFactorsOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        
        int factors = 0;
        
        for(int i = 1;i <= number;i++){
          if(number %i == 0){
              factors++;
          }
        }
        System.out.println(factors);
        
    }
}
