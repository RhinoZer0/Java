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
public class LowercaseDetection {
    public static void main(String args[]){
        String phrase = "This is a Test string";
        int counter=0;
        
        for(int i=0; i<phrase.length(); i++)
        {            
            if(Character.isLowerCase(phrase.charAt(i)))
                counter++;
        }
        System.out.println("counter = " + counter);
    }
}
