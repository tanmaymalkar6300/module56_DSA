package module56.assignment;
import java.util.*;
import java.io.*;
public class Q1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter the number of elements present in the array");
        int n = scan.nextInt();


        System.out.println("Enter the array");
        int [] arr = new int [n];

        for(int i=0; i<n; i++){
            arr[i]= scan.nextInt();
        }
        System.out.println("Enter the target element");
        int x = scan.nextInt();

        int idx=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                idx=i;
                break;  
            }
        }
        if(idx==-1) {
            System.out.println("Searched element is not found in the array");
        }
        else {
            System.out.println("Element is found in the array:" + idx);
        }
    }
}