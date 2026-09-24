/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class ReverseAString {
    public static void main(String[] args) {
        
        String string = "The quick brown fox";
        String reverseString = "";
        
        for(int i = string.length() -1 ;i >= 0;i--){
            
            reverseString += string.charAt(i);
         
        }
          
        System.out.println("Reverse string: " + reverseString);
    }
}
