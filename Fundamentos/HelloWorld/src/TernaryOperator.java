/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uidj7796
 */
public class TernaryOperator {
    public static void main(String args[])
    {
        String result = (1 > 2) ? "true" : "false";
        System.out.println("result = " + result);
        
        int number = 9;
        result = (number % 2 == 0) ? "Pair" : "Odd";
        System.out.println("result = " + result);
    }
    
}
