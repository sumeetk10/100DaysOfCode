public class MissingNo {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        //missingNumber(nums);
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
            
        int n = nums.length;
        int sum = 0;
        int totalsum = 0;
            
            for(int i=0; i<n; i++) {
                sum += nums[i];
            }
            
            int max = nums[0];
            for(int j=0; j<n; j++)
            {
                if(nums[j] > max) {
                    max = nums[j];   
                }
            }
            
            for(int k=0; k <= max; k++) {
                totalsum += k;
            }
            
        return (totalsum-sum);
    }
}
