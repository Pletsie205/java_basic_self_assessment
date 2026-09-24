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
public class CountCharactersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        String string = "";
        int number = 0;
        int letter = 0;
        int other = 0;
        int space = 0;
        
        System.out.println("Enter a string");
        string = scanner.nextLine();
        
        for(int i = string.length() -1 ;i >= 0;i--){
            
            char character = string.charAt(i);
            
            if(Character.isLetter(character)){
                
                letter++;
            }
            else if(Character.isDigit(character)){
                
                number++;
            }
            else if(Character.isWhitespace(character)){
                
                space++;
            }
            else{
                
                other++;
            }
           
        }
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other:" + other);       
    }
}
