package module56.sorting;

public class Q4 {
       
 
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 0};
        int iterations = bubbleSortDescending(arr);
        System.out.println("Number of iterations to sort the array in descending order: " + iterations);
    }

    public static int bubbleSortDescending(int[] arr) {
        int n = arr.length;
        int iterations = 0;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                iterations++;
            }
            // If no elements were swapped, array is sorted
            if (!swapped) {
                break;
            }
        }
        return iterations;
    }
}

    
