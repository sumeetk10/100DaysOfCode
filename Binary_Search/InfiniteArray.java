public class InfiniteArray {
    public static void main(String[] args) {
        int[] a ={1,3,5,8,10,13,15,16,19,22,25,27};
        int target = 15;
        int ans1 = Range(a, target);
        System.out.println("output" +ans1);
        
    }

    static int Range(int[] a, int target){
        int start = 0;
        int end = 1;
        while(target > a[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
            // int ans2 = BinarySearch(a, target, newStart, newEnd);
            // return ans2;
        }
        
        int ans2 =  BinarySearch(a, target, start, end);
        return ans2;

    }

    static int BinarySearch(int[] a, int target, int start, int end)
    {

        while(start < end)
        {
            int mid = start+(end-start)/2;
            if(target < a[mid])
            {
                end = mid -1;
            } else if(target > a[mid]){
                start = mid + 1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
