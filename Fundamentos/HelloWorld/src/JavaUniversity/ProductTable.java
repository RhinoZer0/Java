package JavaUniversity;

import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uidj7796
 */
public class ProductTable { 
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(N + " x " + i + " = " + (N*i) + '\n');
        }
        bufferedReader.close();
    }
}
