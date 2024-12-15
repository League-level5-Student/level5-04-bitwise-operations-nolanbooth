package _03_Printing_Binary;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */


    public static void printByteBinary(byte b0) {
        // We first want to print the bit in the one's place
    	
        // Shift b seven bits to the right

        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1

        // Print the result using System.out.print (NOT System.out.println)

        //Use this method to print the remaining 7 bits of b
    	
    	
    	
    	for(int i = 7; i >= 0; i--) {
    	byte b = b0;
    	b = (byte)(b >> i);
    	
    	b = (byte)(b & 1);
    	
    	
    	System.out.print(b);
    	}
    	
    }

    public static void printShortBinary(short s) {
        // Create 2 byte variables

        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte

        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    	
    	short shifter = s;
    	
    	byte a = (byte)(shifter>>8);
    	shifter = s;
    	byte b = (byte)((shifter<<8)>>8);
    	
    	printByteBinary(a);
    	printByteBinary(b);
    	
    	
    	
    	
    }

    public static void printIntBinary(int i) {
        // Create 2 short variables

        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short
    	int backup = i;
    	
    	short a = (short)(backup>>16);
    	backup = i;
    	short b = (short)((backup<<16)>>16);
    	
    	printShortBinary(a);
    	printShortBinary(b);
    	
    	
        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    	
    	
    }

    public static void printLongBinary(long l) {
        // Use the same method as before to complete this method
    	long backup = l;
    	
    	int a = (int)(backup>>32);
    	backup = l;
    	int b = (int)((backup<<32)>>32);
    	
    	printIntBinary(a);
    	printIntBinary(b);
    	
    }

    public static void main(String[] args) {
        // Test your methods here
    	
    	//printByteBinary(bite);
    	byte noah = 100;
    	short aShort = Short.MAX_VALUE;
    	int intMaxValue = Integer.MAX_VALUE;
    	long longMaxValue = Long.MAX_VALUE;
    	
    	longMaxValue = 9223372036854775807l; //gotta put l at the end to make it a long, or else it is an int, which overflows. 
    	intMaxValue = 2147483647;
    	
    	
    	System.out.println("byte binary print: ");
    	printByteBinary(noah);
    	System.out.println();
    	System.out.println("short binary print: ");
    	printShortBinary(aShort);
    	System.out.println();
    	System.out.println("integer binary print: ");
    	printIntBinary(intMaxValue);
    	System.out.println();
    	System.out.println("long binary print: ");
    	printLongBinary(longMaxValue);
    	
    	
    }
}
