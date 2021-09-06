/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUniversity;

import java.util.Scanner;
/**
 *
 * @author uidj7796
 */
public class NotesSystem {
    public static void main(String args[]){
        float Note;
        String result = "Not passed";
        Scanner console = new Scanner(System.in);
        
        System.out.print("Insert note: ");
        Note = console.nextFloat();
        
        if(Note >=9 && Note <= 10)
            result = "A";
        else if(Note >= 8 && Note < 9)
            result = "B";
        else if(Note >= 7 && Note < 8)
            result = "C";
        else if(Note >= 6 && Note < 7)
            result = "D";
        else if(Note >= 0 && Note < 6)
            result = "F";
        else
            result = "Unknown";
        
        System.out.println("result = " + result);
    }    
}
