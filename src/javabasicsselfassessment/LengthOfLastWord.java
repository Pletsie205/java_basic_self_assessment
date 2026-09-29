/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        
        String sentence = "The length of last word";
        int length;
        
        String words[] = sentence.split(" ");
        
        length = words[words.length - 1].length();
        
        System.out.println("Original String: " + sentence);
        System.out.println("Length of the last word of the above string:" + length);
    }
}
