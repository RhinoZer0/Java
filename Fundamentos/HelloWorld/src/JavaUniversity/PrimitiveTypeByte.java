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
public class PrimitiveTypeByte {
    public static void main(String args[]){
        /*
            Primitive int types:
            byte    8 bits
            short   16 bits
            int     32 bits
            long    64 bits
        */
        byte byteVariable = (byte)127;
        System.out.println("byteVariable = " + byteVariable);
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE);
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE);
    }
}
