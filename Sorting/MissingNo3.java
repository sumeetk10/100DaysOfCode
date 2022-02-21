public class MissingNo3 {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        //missingNumber(nums);
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int x1 = nums[0];
        int x2 = 1;

        for (int i = 1; i < nums.length; i++) {
            x1 = x1 ^ nums[i];
        }

        for (int j = 2; j < nums.length+1; j++) {
            x2 = x2 ^ j;
        }

        return (x1^x2);
    }
}
