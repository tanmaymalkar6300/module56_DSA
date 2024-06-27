package module56.assignment;
import java.util.*;
import java.io.*;


public class Q3 {
    
   public static int numberOf1s(int[] nums, int low, int high){
    while(low <= high){
        int mid = low + (high  - low)/2;
        
        if(nums[mid] == 0){
            low = mid + 1;
        }
        else {
            high  = mid - 1;
        }
    }
    return (nums.length - low);
 }

 public static void main(String args[]){
 
     
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number of elements you want to add : ");
     int n=sc.nextInt();      
     
     int []arr = new int[n];
     
     System.out.print("Enter the elements of the array: ");
     
     for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
     }
     
     System.out.println("The number of one's in the given array is/are: " + numberOf1s(arr , 0 , n - 1));
 }     
}