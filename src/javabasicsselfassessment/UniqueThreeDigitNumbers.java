/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class UniqueThreeDigitNumbers {
    public static void main(String[] args) {
        
         for(int i = 1; i <=4; i++){
          
            for(int j = 1; j <=4; j++){
               
                for(int k = 1; k <=4; k++){
                    
                    if (i != j && i != k && j != k) {
                        System.out.println(i + "" + j + "" + k);
                    }
          
                }
        
            }
        }
    }
    
}
