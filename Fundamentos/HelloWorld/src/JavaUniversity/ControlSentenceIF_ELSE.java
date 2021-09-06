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
public class ControlSentenceIF_ELSE{
    public static void main(String args[]){
        boolean condition = false;
        
        if(condition){
            System.out.println("True condition");
        }
        else{
            System.out.println("False condition");
        }
        
        int number = 4;
        String numberText = "Unknown number";
        
        if(number == 1){
            numberText = "Number one";
        }
        else if(number == 2){
            numberText = "Number two";           
        }
        else if(number == 3){
            numberText = "Number three";            
        }
        else{
            //numberText = "Number not found";
        }
        System.out.println("numberText = " + numberText);
    }
}