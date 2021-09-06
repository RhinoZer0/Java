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
public class StringConcatenation {

    public static void main(String args[]) {
        String sUser = "John";
        String sTitle = "Engineer";

        String sUnion = sTitle + " " + sUser;
        System.out.println("sUnion = " + sUnion);
        
        int i32Var1 = 3;
        int i32Var2 = 4;
        
        System.out.println(i32Var1 + i32Var2);                  //Integer addition
        System.out.println(i32Var1 + i32Var2 + " " + sUser);    //Do the addition and concatenates the string
        System.out.println(sUser + " " + i32Var1 + i32Var2);    //Concatenates all as string
        System.out.println(sUser + " " + (i32Var1 + i32Var2));  //Do the addition first and then concatenates the string
    }

}
