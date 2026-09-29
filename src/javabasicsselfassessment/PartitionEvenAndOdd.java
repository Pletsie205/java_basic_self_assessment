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
public class PartitionEvenAndOdd {
    public static void main(String[] args) {
        
        int[] numbers = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        int[] result = new int[numbers.length];
        int position = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                result[position] = numbers[i];
                position++;
            }
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                result[position] = numbers[i];
                position++;
            }
        }
        
        System.out.println("Original array:" + Arrays.toString(numbers));
        System.out.println("After partition the said array becomes:" + Arrays.toString(result));
    }
}
