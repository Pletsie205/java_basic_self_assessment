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
public class CountPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the number(n):");
        int n = scanner.nextInt();
        
        int primeCount = 0;

        for (int i = 2; i <= n; i++) {

            boolean prime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                primeCount++;
            }
        }
        System.out.println("Number of prime numbers which are less than or equal to n.:");
        System.out.println(primeCount);
    }
}
