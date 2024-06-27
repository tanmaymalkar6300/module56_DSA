package module56.assignment;
import java.util.*;
import java.io.*;


public class Q4 {

    public static int lastOccurrence(int[] arr, int low, int high, int target){
        
        
        int result =-1;
        while(low<=high){
            int mid = low +( high-low)/2;
            if(arr[mid]== target){
                result = mid;
                low = mid +1;
            }
            else if(arr[mid] > target){
                high = mid -1;
            }
            else low = mid+1;
        }
        return result;
    }

    public static int firstOccurrence(int[] arr, int low, int high, int target){
        int result=-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                result =mid;
                high= mid-1;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
            else {
                low= mid+1;
            }
        }
            return result;


        
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements present in the array");
        int n = scan.nextInt();

        System.out.println("Enter the array");
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
      
        int target;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("enter the target: ");
        target = sc1.nextInt();

       
    
    int first = firstOccurrence(arr, 0, n-1, target);
    int last = lastOccurrence(arr, 0, n-1, target);

    if(first == last && first == -1){
        System.out.println("The target does not exist in the array.");
        
    }
    else
    System.out.println("The frequency of target in the given array is " + (last - first + 1) + "time/times");
}
}
    

    


