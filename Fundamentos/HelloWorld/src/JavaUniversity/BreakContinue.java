/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUniversity;

/**
 *
 * @author uidj7796
 */
public class BreakContinue {
    public static void main(String args[])
    {
        for(int counter = 0; counter < 10; counter++)
        {
            if(counter % 2  != 0)
            {
                continue;
            }
            System.out.println("counter = " + counter);
        }
        
//        for(int counter = 0; counter < 3; counter++)
//        {
//            if(counter % 2  == 0)
//            {
//                System.out.println("counter = " + counter);
//                //break;
//            }
//        }
    }    
}
