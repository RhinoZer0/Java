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
public class ConditionalOperators {
    public static void main(String args[]){
        int a = -10;
        int minimumValue = 0;
        int maximunValue = 10;
        
        boolean result = a >= 0 && a <= 10;
        if(result)
            System.out.println("In range");
        else
            System.out.println("Out of range");
        
        boolean vacation = true;
        boolean restDay = false;
        
        if(vacation || restDay)
            System.out.println("Can go to son's game");
        else
            System.out.println("He is busy");
    }
    
}
