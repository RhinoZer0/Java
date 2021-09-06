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
public class Palindrome {
    public static void main(String args[]){
        String A = "Murder for a jar of red rum";
        String B = A.toLowerCase();
        int size = B.length();
        System.out.println("size = " + size);
        int i=0;
        int j=size-1;
        boolean result = true;
        
        while(result && i<j){
            while(B.charAt(i) == ' '){
                i++;
            }
            
            while(B.charAt(j) == ' '){
                j--;
            }
            
            result = B.charAt(i) == B.charAt(j);
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            i++;
            j--;
        }       
        
        if(result)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
