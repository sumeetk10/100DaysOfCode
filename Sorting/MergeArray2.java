import java.util.Arrays;

public class MergeArray2 {
    public static void main(String[] args) {
    int[] nums1 = {1,2,4};
    int m = nums1.length;

    int[] nums2 = {2,8,6};
    int n = nums2.length;
    int[] result = new int[m+n];
    
    merge(nums1, m, nums2, n, result);
    System.out.println(Arrays.toString(result));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n,int[] result) {
        
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            result[m + i] = nums2[i];
        }

        for(int i=0; i<result.length; i++) {
            
            for(int j=1; j<result.length; j++) {
                
                if(result[j-1] > result[j]) {
                int temp = result[j-1];
                result[j-1] = result[j];
                result[j] = temp;
               }             
            
            }
        }
    }
}    
