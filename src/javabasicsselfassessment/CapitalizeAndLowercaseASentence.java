/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class CapitalizeAndLowercaseASentence {
    public static void main(String[] args) {
        
        String sentence = "the quick brown fox jumps over the lazy dog.";
        
        String[] words = sentence.split(" ");
        String result = "";

        for(int i = 0; i < words.length; i++) {
            String word = words[i];

            result += word.substring(0, 1).toUpperCase()
                + word.substring(1).toLowerCase()
                + " ";
        }

        System.out.println(result);
    }
}
