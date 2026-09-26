/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class CountDivisiblesInRange {
    public static void main(String[] args) {
        
        int values = 0;
       
        
        for(int i =1;i <= 20;i++){
            
            if(i %4 == 0){
             values++;
            }
        }
        System.out.println(values);
    }
}
