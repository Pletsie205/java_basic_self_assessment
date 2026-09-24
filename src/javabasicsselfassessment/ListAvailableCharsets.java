/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;
import java.nio.charset.Charset;
/**
 *
 * @author IT CENTER
 */
public class ListAvailableCharsets {
    public static void main(String[] args) {
        
        System.out.println("List of available character sets:");
        
        for (String charset : Charset.availableCharsets().keySet()) {
            System.out.println(charset);
        }
    }
}
