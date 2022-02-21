import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
    int[] nums1 = {1,2,5};
    int m = nums1.length;

    int[] nums2 = {2,5,6};
    int n = nums2.length;
    int[] result = new int[m+n];
    
    merge(nums1, m, nums2, n, result);
    System.out.println(Arrays.toString(result)); 

    }


    static void merge(int[] nums1, int m, int[] nums2, int n,int[] result) {
        
        //int[] result = new int[m+n];
        
        System.arraycopy(nums1,0,result,0,m);
        System.arraycopy(nums2,0,result,m,n);
        
        //System.out.println(Arrays.toString(result));
        
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
