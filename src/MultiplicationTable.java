/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IT CENTER
 *
 */
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter a number you want to generate multiplecation table for");
       int number = scanner.nextInt();
       scanner.nextLine();
       for(int i = 1;i <=10;i++){
           
           System.out.println(number + " x " + number +"= "+ (number * i));
       }
    }
    
}
