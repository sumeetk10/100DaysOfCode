import java.util.Arrays;

public class AlgoSelection {
    private static int max;

    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2};
        //max(arr);
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            int max = arr[0];
            if(arr[i+1] > max){
                max = arr[i+1];
            }else{
                continue;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[max-i];
            arr[max -i] = max;
            max = temp;
            //max--;
        }
    }
        //return max;
    

    /*static void SelectionSort(int[] arr)
    {
        //int max = max(arr);

        for (int i = 0; i < arr.length-1; i++) {
            int temp = arr[max-1];
            arr[max -1] = max;
            max = temp;
        }
    */
}
