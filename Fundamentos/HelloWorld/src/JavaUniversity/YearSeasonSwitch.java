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
public class YearSeasonSwitch {
    public static void main(String args[]){
        int month;
        String season = "Unknown season";
        Scanner console = new Scanner(System.in);
        
        System.out.print("Insert month number: ");
        month = console.nextInt();
                
        switch(month)
        {
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                season = "Not found";
        }
        System.out.println("season = " + season);
    }
}
