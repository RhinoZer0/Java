package JavaUniversity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uidj7796
 */
public class PrimitiveTypes {
    public static void main(String args[]){
        int i32MyVariable = 10;
        System.out.println(i32MyVariable);
        System.out.println("i32MyVariable = " + i32MyVariable);
        
        //Modify i32MyVariable value
        i32MyVariable = 5;
        System.out.println(i32MyVariable);
        System.out.println("i32MyVariable = " + i32MyVariable);
        
        String sMyStringVariable = "Greetings";
        System.out.println(sMyStringVariable);
        System.out.println("sMyStringVariable = " + sMyStringVariable);
        
        //Modify sMyStringVariable value
        sMyStringVariable = "Goodbye";
        System.out.println(sMyStringVariable);
        System.out.println("sMyStringVariable = " + sMyStringVariable);
        
        //var - infere data types
        var vMyVariable2 = 15;
        System.out.println(vMyVariable2);
        System.out.println("vMyVariable2 = " + vMyVariable2);
        
        //Use var type to save a string
        var vMyStringVariable2 = "Use var to infere string literal";
        System.out.println(vMyStringVariable2);
        System.out.println("vMyStringVariable2 = " + vMyStringVariable2);
        
    }    
}
