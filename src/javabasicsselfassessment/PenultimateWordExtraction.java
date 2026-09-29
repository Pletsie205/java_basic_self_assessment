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
public class PenultimateWordExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        String word = words[words.length - 2];

        System.out.println("Penultimate word: " + word);
    }
}
