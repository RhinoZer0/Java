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
public class SwitchSentence {
    public static void main(String args[]){
        int number = 41;
        String numberText = "Unknown value";
                
        switch(number)
        {
            case 1:
                numberText = "Number one";
                break;
            case 2:
                numberText = "Number two";
                break;
            case 3:
                numberText = "Number three";
                break;
            case 4:
                numberText = "Number four";
                break;
            default:
                numberText = "Not found";
        }
        System.out.println("numberText = " + numberText);
    }
    
}
