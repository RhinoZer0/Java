/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uidj7796
 */
public class PrimitiveTypeBoolean {
    public static void main(String args[])
    {
        boolean bBooleanVariable = true;
        System.out.println("bBooleanVariable = " + bBooleanVariable);
        
        if(true == bBooleanVariable)
        {
            System.out.println("Flag is true");
        }
        else
        {
            System.out.println("Flag is false");
        }
        
        int iAge = 20;
        //boolean iIsAdult = iAge >= 18;
        if( iAge>=18 )
        {
            System.out.println("You are an adult");
        }
        else
        {
            System.out.println("You are not an adult");
        }
    }
}
