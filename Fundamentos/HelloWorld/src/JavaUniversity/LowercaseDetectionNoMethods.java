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
public class LowercaseDetectionNoMethods {
    public static void main(String args[]){
        String phrase = "This Is a Test string";
        int counter=0;
        
        for(int i=0; i<phrase.length(); i++)
        {      
            char testChar = phrase.charAt(i);
            if(testChar >= 'a' && testChar <= 'z')
                counter++;
        }
        System.out.println("counter = " + counter);
    }
}
