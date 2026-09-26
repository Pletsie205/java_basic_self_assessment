/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;
import java.io.File;
/**
 *
 * @author IT CENTER
 */
public class FileSizeFinder {
    public static void main(String[] args) {
        String filePath1 =  "C:\\Java\\abc.txt";
        String filePath2 =  "C:\\Java\\test.txt";
        
        File abc = new File(filePath1);
        File test = new File(filePath2);
        
        long size1 = abc.length();
        long size2 = test.length();
        
        System.out.println(filePath1 + " " + size1 + " byte");
        System.out.println(filePath2  + " " +  size2 + " byte");
        
        
    }
}
