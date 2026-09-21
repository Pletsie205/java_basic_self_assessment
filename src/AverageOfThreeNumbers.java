/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IT CENTER
 */
import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        int[] numbers =new int[3];
        double average;
        int total = 0;
        
         for(int i = 0;i < 3;i++){
             System.out.println("Enter an intiger number");
             numbers[i] = scanner.nextInt();
             scanner.nextLine();
             total += numbers[i]; 
         }
         average = total/3;
         System.out.println("Average of three numbers is: " + average);
         
        
    }
}
