package module56.numberSystem;

import java.util.Scanner;
public class Q1 {
    public static void main (String[] args){
 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Integer number");
        
        int n = scan.nextInt();
        String binaryString =Integer.toBinaryString(n);

        System.out.println("Binary representation of " + n + " is:  " + binaryString);      
 
    }
}