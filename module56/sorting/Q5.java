package module56.sorting;



    public class Q5 {
        public static void main(String[] args) {
            int[] array = {3, 5, 1, 6, 0};
            int iterations = selectionSortDescending(array);
            System.out.println("Number of iterations to sort the array in descending order: " + iterations);
        }
    
        public static int selectionSortDescending(int[] array) {
            int n = array.length;
            int iterations = 0;
    
            for (int i = 0; i < n - 1; i++) {
                int maxIdx = i;
                for (int j = i + 1; j < n; j++) {
                    iterations++;
                    if (array[j] > array[maxIdx]) {
                        maxIdx = j;
                    }
                }
                int temp = array[maxIdx];
                array[maxIdx] = array[i];
                array[i] = temp;
            }
            return iterations;
        }
    }
    
    
