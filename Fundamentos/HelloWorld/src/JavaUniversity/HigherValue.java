/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUniversity;

import java.util.Scanner;
/**
 *
 * @author uidj7796
 */
public class HigherValue {
    public static void main(String args[]){
        int numberA;
        int numberB;
        Scanner console = new Scanner(System.in);
        
        System.out.println("Insert number A: ");
        numberA = console.nextInt();
        System.out.println("Insert number B: ");
        numberB = console.nextInt();
        
        System.out.println("Higher number is " + (numberA > numberB ? numberA : numberB));
        
        /*if(numberA>numberB)
            System.out.println("Higher number is A");
        else
            System.out.println("Higher number is B");        
        */
    }
}
