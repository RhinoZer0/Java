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
public class ParenthesisEvaluator {
    public static void main(String args[]){
        String testString = "({([}))]";
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;        
        
        for(int i=0; i<testString.length(); i++)
        {
            char charTest = testString.charAt(i);
            if(charTest == '(')
                aCounter++;
            else if(charTest == ')')
                aCounter--;
            
            if(charTest == '[')
                bCounter++;
            else if(charTest == ']')
                bCounter--;
            
            if(charTest == '{')
                cCounter++;
            else if(charTest == '}')
                cCounter--;
            
            if(aCounter < 0 || bCounter < 0 || cCounter < 0)                           
                break;
        }        
        if(aCounter == 0 && bCounter == 0 && cCounter == 0)
            System.out.println("String is correct paps");
        else
            System.out.println("String is incorrect paps");
    }    
}
