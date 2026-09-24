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
public class InputAndDisplayPassword {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your password");
        String password = scanner.nextLine();
        
        System.out.println("Your password was: " + password);
    }
}
