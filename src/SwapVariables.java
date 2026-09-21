/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IT CENTER
 */
public class SwapVariables {
    public static void main(String[] agrs){
        
        int a = 15;
        int b =27;
        int temporary;
        
        temporary = a;
        a = b;
        b = temporary;
        
        System.out.println( a + " " + b);
    }
}
