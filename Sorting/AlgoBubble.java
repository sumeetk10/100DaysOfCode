import java.util.Arrays;

public class AlgoBubble {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void BubbleSort(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {

                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
