package JavaUniversity;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uidj7796
 */
public class StringCompare {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        String inputString = console.nextLine();
        String originalString = "Hello";
        
        boolean result = inputString.equals(originalString);
        System.out.println("result = " + result);
    }
    
}
