public class DuplicateElement {
    
    static boolean containsDuplicate(int[] nums) {

        for(int i=0; i<nums.length-1; i++) {
            int start = nums[i];
            for(int j=nums.length-1; j > i; j--) {
                
                if(start == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,1};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
}
