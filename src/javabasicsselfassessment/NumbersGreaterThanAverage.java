/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

import java.util.Arrays;

/**
 *
 * @author IT CENTER
 */
public class NumbersGreaterThanAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 17, 7, 25, 3, 100};
        int[] bigs = new int[numbers.length];

        double average;
        int total = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
            count++;
        }

        average = (double) total / count;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                bigs[i] = numbers[i];
            }
        }


        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("The average of the said array is: " + average);
        System.out.println("The numbers in the said array that are greater than the average are:");

        for (int i = 0; i < bigs.length; i++) {
            if (bigs[i] != 0) {
                System.out.println(bigs[i]);
            }
        }
    }
}
