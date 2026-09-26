/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author IT CENTER
 */
public class FormattedDateAndTime {
    public static void main(String[] args) {
        
        Date date = new Date();
        
        SimpleDateFormat format = new SimpleDateFormat("yyy/MM/dd HH:mm:ss.SSS");
        System.out.println("Now: " + format.format(date));
    }
}
