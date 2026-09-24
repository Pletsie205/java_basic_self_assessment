/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicsselfassessment;

/**
 *
 * @author IT CENTER
 */
public class PolygonArea {
    public static void main(String[] args){
        
        int numberOfSides = 7;
        int sideLength = 6;
        double area = (numberOfSides * sideLength * sideLength) /(4 * Math.tan(Math.PI / numberOfSides));
        
        System.out.println("The area of the polygon is: " + area);
    }
}
