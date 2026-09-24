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
public class Compute {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Enter an integer");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        int nn = n * 11;
        int nnn = n * 111;
        
         int sum = n + nn + nnn;
        System.out.println((n + " + " + nn + " + " + nnn) + " = " + sum);
    }
}
