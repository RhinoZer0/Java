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
public class OperatorPrecedence {
    public static void main(String args[]){
        int x = 5;
        int y = 10;
        int z = ++x + y--;
        
        System.out.println("x = " + x);//6
        System.out.println("y = " + y);//9
        System.out.println("z = " + z);//16
        
        int resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);
        
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
    }
}
