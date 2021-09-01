/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uidj7796
 */
public class UnaryOperators {
    public static void main(String args[]){
        int a = 3;
        int b = -a;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        boolean c = true;
        boolean d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //pre increment
        int e = 3;
        int f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //post increment
        int g = 5;
        int h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //pre decrement
        int i = 2;
        int j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //post decrement
        int k = 4;
        int l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        
    }
}
