public class MajorityElement {
    static void findMajority(int nums[], int n) {

        int max;
        int count = 0;
        
        for(int i=0; i<nums.length-1; i++) {
            max = nums[i];
            for(int j=i; j<nums.length; j++) {
                if(max == nums[j]) {
                //max = nums[i];
                 count++;
                }
            }
           
        
        
        //int half = nums.length/2;
        if(count > n/2 && count>0) {
            System.out.println(max);
            break;
        }
        
    
        }
           
        
    //return -1;
    }
    
        
    

    public static void main(String[] args)
    {
 
        int nums[] = {8,8,7,7,7};
        int n = nums.length;
 
        // Function calling
        findMajority(nums, n);
    }
}
