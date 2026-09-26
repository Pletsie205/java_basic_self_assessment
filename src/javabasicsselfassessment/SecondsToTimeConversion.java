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
public class SecondsToTimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input seconds: ");
        int secondss = scanner.nextInt();
        scanner.nextLine();
        
        int hours = secondss / 3600;
        int remainingSeconds = secondss % 3600;

        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        
        System.out.println(hours + " : " + minutes + " : " + seconds);
    }
}
