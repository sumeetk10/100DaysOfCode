import java.util.Arrays;

public class AlgoInsertion {
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                
                if(arr[j-1] > arr[j]) {
                    swap(arr,j-1,j);
                }else{
                    break;
                }
            
                       
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        //for (int j2 = 0; j2 < arr.length; j2++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        //}
    }
}
