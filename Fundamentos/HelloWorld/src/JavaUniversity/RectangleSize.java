package JavaUniversity;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package JavaUniversity;

/**
 *
 * @author uidj7796
 */
public class RectangleSize {
    public static void main(String args[]){
        int width;
        int height;        
        Scanner console = new Scanner(System.in);
        
        System.out.println("Insert width: ");
        width = console.nextInt();
        System.out.println("Insert height: ");
        height = console.nextInt();
        
        System.out.println("Perimeter: " + ((width + height) * 2));
        System.out.println("Area: " + width * height);        
    }    
}
