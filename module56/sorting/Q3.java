package module56.sorting;
import java.util.*;
import java.io.*;


public class Q3 {

    public static void insertionSort(int[] a){
        int n = a.length;

        for(int i =1; i<n; i++){
            int j=i;
            while(j>0 && a[j] >a[j-1]){

                int temp = a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                
                j--;
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements present in the array");
        int n = scan.nextInt();
         
        int[] arr = new int[n];
        System.out.println("Enter the array");
        for(int i=0; i<n; i++){
        arr[i]= scan.nextInt();
        }
        //function calling


        insertionSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
    
}
