/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

/**
 *
 * @author uidj7796
 */
public class TestArithmetic {
    public static void main(String[] args) {
        Arithmetic arithmetic1 = new Arithmetic();
        
        arithmetic1.a = 10;
        arithmetic1.b = 20;
        arithmetic1.addition();
        
        int result = arithmetic1.additionWithReturn();
        System.out.println("result from test = " + result);
        
        result = arithmetic1.addWithArguments(15, 30);
        System.out.println("result using arguments = " + result);
        System.out.println(arithmetic1.a);
        System.out.println(arithmetic1.b);
    }    
}
