package module56.assignment;
import java.util.*;
import java.io.*;

public class Q5 {

    public static int findSquareRoot(int num){
        int low=0,  high=num, result = -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            long val = mid*mid;

            if(val==num ){
                return mid;
            }
            
            else if(val<num){
                result =  mid;
                low = mid + 1;
            } 
            else{
                high= mid-1;
            }
        }
        return result;
}

     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number  of which you want the square root");
        int n = scan.nextInt();
     


     //function calling
     int result = findSquareRoot(n);
     System.out.println("Square root of the given number is: " + result);


    
     } 
}
