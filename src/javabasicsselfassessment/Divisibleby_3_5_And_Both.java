/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class Divisibleby_3_5_And_Both {
    public static void main(String[] args) {
        
        String divisibleBy3 = "";
        String divisibleBy5 = "";
        String divisibleByBoth = "";
        
        for(int i = 1;i < 100; i++){
            
            if(i %5 == 0 && i %3 == 0){
                
                divisibleByBoth += i + " , ";
                
            }else if(i %3 == 0){
                
                divisibleBy3 += i + " , ";
            
            }else if(i %5 == 0){
                
                divisibleBy5 += i + " , ";
            
            }
        }
        
        System.out.println("Divisible by 3: \n" + divisibleBy3);
        System.out.println("Divisible by 5: \n" + divisibleBy5);
        System.out.println("Divisible by both: \n" + divisibleByBoth);
    }
}
