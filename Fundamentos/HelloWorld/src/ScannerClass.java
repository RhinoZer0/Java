
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uidj7796
 */
public class ScannerClass {
    public static void main(String args[]){
        System.out.println("Write your name: ");
        Scanner console = new Scanner(System.in);
        String sUser = console.nextLine();
        System.out.println("sUser = " + sUser);
        
        System.out.println("Write a title");
        String sTitle = console.nextLine();
        System.out.println("sTitle = " + sTitle);
        
        System.out.println("Result: " + sUser + " " + sTitle);
    }
}
