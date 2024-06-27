package module56.assignment;
import java.util.*;
import java.io.*;

public class Q2 {

    public static int lastOccurrence(int[] arr,int target ){
    int low =0, high = arr.length -1;
    int result =-1;
    while(low <= high){
        int mid = low + (high - low )/2;
        if(arr[mid] == target){
            result = mid;

            low = mid +1;
        }
        else if (arr[mid]> target){
            high= mid-1;
        }
        else{
            low=mid+1;
        }
    }return result;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements present in the array");
        int n = scan.nextInt();

        
        System.out.println("Enter the array");
        int[] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the target element");
        int target =scan.nextInt();

        int result = lastOccurrence(arr, target);
        if (result == -1){
            System.out.println("Searched element id not found in the target ");

        }else{
            System.out.println("Target element last Occurrence is present at index: " +result);
        }




    }
    
}
