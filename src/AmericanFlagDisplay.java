/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IT CENTER
 */
public class AmericanFlagDisplay {
    public static void main(String[] agrs){
        
        for(int r = 1;r <= 15;r++){
            
            for(int c = 1; c <= 35;c++){
                
                if(r < 9 &  c < 6){
            System.out.print("*");
            }else{
                System.out.print("=");
            }
            }
            System.out.println();
        }   
    }
}
