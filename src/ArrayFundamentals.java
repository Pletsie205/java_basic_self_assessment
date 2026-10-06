/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author IT CENTER
 */
public class ArrayFundamentals {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int[] n = {3,2,10,7,9,12};
        String[] names ={"Taelo"," Mpho", "Khotso", "Thabo"};
    
    // Sum All Values in an Array .
    int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("1. Sum: " + sum);
        
    // Calculate Average of Array Elements 
    double average = (double) sum / numbers.length;

        System.out.println("2. Average: " + average);
        
    // Find Max and Min in an Array
     int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("3. Maximum: " + max);
        System.out.println("   Minimum: " + min);
    
    
    // Check if Array Contains a Specific Value
    int searchValue = 5;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == searchValue) {
                found = true;
                break;
            }
        }
        
         System.out.println("4. Contains " + searchValue + ": " + found);
    
    
    // Find Index of an Element in an Array
     int value = 7;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == value) {
                index = i;
                break;
            }
        }

        System.out.println("5. Index of " + value + ": " + index);
    
    
    // Reverse an Integer Array 
    int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println("6. Reversed array: " + Arrays.toString(reversed));
    
    
    // Copy Array Using Iteration
     int[] copied = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            copied[i] = numbers[i];
        }

        System.out.println("7. Copied array: "
                + Arrays.toString(copied));
    
    
    // Count Even and Odd Numbers in an Array
    int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("8. Even numbers: " + evenCount);
        System.out.println("   Odd numbers: " + oddCount);
    
    
    // Find Duplicates in an Integer Array
    System.out.print("9. Duplicates: ");

        for (int i = 0; i < n.length; i++) {

            for (int j = i + 1; j < n.length; j++) {

                if (n[i] == n[j]) {
                    System.out.print(n[i] + " ");
                }
            }
        }

        System.out.println();
    
    // Sort Numeric and String Arrays
    int[] sortedNumbers = numbers.clone();
        String[] sortedNames = names.clone();

        Arrays.sort(sortedNumbers);
        Arrays.sort(sortedNames);

        System.out.println("10. Sorted numbers: " + Arrays.toString(sortedNumbers));

        System.out.println("Sorted names: " + Arrays.toString(sortedNames));
    
    // Remove a Specific Element from an Array
     int removeValue = 5;
        int[] newArray = new int[numbers.length - 1];

        int position = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != removeValue) {
                newArray[position] = numbers[i];
                position++;
            }
        }

        System.out.println("11. After removing " + removeValue + ": "
                + Arrays.toString(newArray));
    
    
    // Find the Second Largest Array Element
        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest
                    && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("12. Second largest: " + secondLargest);
    
    
    // Common Elements in Two Integer Arrays
    System.out.print("13. Common elements: ");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < n.length; j++) {

                if (numbers[i] == n[j]) {
                    System.out.print(numbers[i] + " ");
                    break;
                }
            }
        }

        System.out.println();
        
    
    // Check if Two Arrays Are Equal
    int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {1, 2, 3};

        boolean equal = true;

        if (arrayOne.length != arrayTwo.length) {

            equal = false;

        } else {

            for (int i = 0; i < arrayOne.length; i++) {

                if (arrayOne[i] != arrayTwo[i]) {
                    equal = false;
                    break;
                }
            }
        }
    
    
    // Convert an Array to an ArrayList
    ArrayList<Integer> numberList = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            numberList.add(numbers[i]);
        }

        System.out.println("15. ArrayList: " + numberList);
    }
}
    
    


