public class MissingNo2 {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        //missingNumber(nums);
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {

        int max = nums[0];
        for(int i=0; i<nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        int totalsum = 0;
        for(int j=0; j <= max; j++) {
            //totalsum += j;
            totalsum = (max*max+max)/2;
        }

        for(int k=0; k<nums.length; k++) {
            totalsum -= nums[k];
        }

        return totalsum;
    }

}
