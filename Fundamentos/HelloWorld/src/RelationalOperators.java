/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uidj7796
 */
public class RelationalOperators {
    public static void main(String args[]){
        int a = 3;
        int b = 2;
        
        boolean c = (a == b);
        System.out.println("c = " + c);
        
        boolean d = (a != b);
        System.out.println("d = " + d);
        
        String cadena1 = "Hello";
        String cadena2 = "Hello";
        boolean e = cadena1 == cadena2;
        System.out.println("e = " + e);
        
        var f = cadena1.equals(cadena2); //Compare strings contents
        System.out.println("f = " + f);
    }
}
