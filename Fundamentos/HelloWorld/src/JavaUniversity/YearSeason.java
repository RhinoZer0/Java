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
public class YearSeason {
    public static void main(String args[]){
        int month;
        Scanner console = new Scanner(System.in);
        String season = "Unknown";
        
        System.out.println("Insert the month");
        month = console.nextInt();
        
        if(month == 1 || month == 2 || month == 12)
        {
            season = "Winter";
        }
        else if(month == 3 || month == 4 || month == 5)
        {
            season = "Spring";
        }
        else if(month == 6 || month == 7 || month == 8)
        {
            season = "Summer";
        }
        else if(month == 9 || month == 10 || month == 11)
        {
            season = "Fall";
        }
        else
        {
            season = "Not found";
        }       
        System.out.println("season = " + season);
    }
}
