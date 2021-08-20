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
public class BookInformation {
    public static void main(String args[]){
        Scanner sConsole = new Scanner(System.in);
        System.out.println("Write a book title: ");
        String sTitle = sConsole.nextLine();
        System.out.println("Write an author");
        String sAuthor = sConsole.nextLine();
        System.out.println(sTitle + " was written by " + sAuthor);
        
    }
}
