package module56.sorting;

import java.util.Arrays;

public class Q1 {
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean swapped = false;

            for( int j=0; j<arr.length -i -1; j++){
                if(arr[j]< arr [j+1]){

                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }   
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args){

        int[] arr = {3,5,1,6,0};

        bubbleSort(arr);
        System.out.println("Sorted array is" );
        System.out.println(Arrays.toString(arr));

    }
    
}
