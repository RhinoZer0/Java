/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uidj7796
 */
public class ArithmeticOperators {
    public static void main(String args[]){
        int a = 4, b = 2;
        int result = a + b;
        
        System.out.println("add result = " + result);
        
        result = a - b;
        System.out.println("minus result = " + result);
        
        result = a * b;
        System.out.println("result = " + result);
        
        var result2 = (float)a / b;
        System.out.println("result2 = " + result2);
        
        result = a % b;
        System.out.println("result = " + result);
        
        if(a % 2 == 0)
            System.out.println("Is a pair number");
        else
            System.out.println("Is an odd number");
    }
}
