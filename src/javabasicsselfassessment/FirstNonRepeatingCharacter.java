/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String word = "google";
        int nonRepeatIndex = -1;

        for (int i = 0; i < word.length(); i++) {

            char currentLetter = word.charAt(i);
            boolean repeated = false;

            for (int j = 0; j < word.length(); j++) {

                if (i != j && currentLetter == word.charAt(j)) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                nonRepeatIndex = i;
                break;
            }
        }

        System.out.println("Index of first non-repeating character in "
                + word + " is: " + nonRepeatIndex);
    }
}