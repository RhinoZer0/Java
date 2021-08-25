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
public class PrimitiveTypeConvertion {
    public static void main(String arghs[]){
        //Convert String to Int
        var Age = Integer.parseInt("20");
        System.out.println("Age = " + (Age + 1));
//        
//        var PiValue = Double.parseDouble("3.1416");
//        System.out.println("PiValue = " + PiValue);
//        
//        //Ask for a value
        var console = new Scanner(System.in);
//        String a = console.nextLine();
//        System.out.println("a = " + a);
//        Age = Integer.parseInt( console.nextLine() );
//        System.out.println("Age = " + Age);
        
        var AgeText = String.valueOf(10);
        System.out.println("AgeText = " + AgeText);

        var Character = "hello".charAt(0);
        System.out.println("Character = " + Character);
        
        System.out.println("Enter a character ");
        Character = console.nextLine().charAt(1);
        System.out.println("Character = " + Character);
    }
}
