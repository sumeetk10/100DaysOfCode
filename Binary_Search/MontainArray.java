public class MontainArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6 ,7 ,8 ,9 ,11,2,1};
        int ans = BinarySearch(arr);
        System.out.println(ans);
    }

    // find the peak element in array
    
    static int BinarySearch(int[] a)
    {
        // return the index
        int start = 0;
        int end = a.length-1;

        while(start < end)
        {
            int mid = start+(end-start)/2;
            if(a[mid] < a[mid - 1])
            {
                end = mid -1;
            } else if(a[mid] < a[mid+1]){
                start = mid + 1;

            }
            else{
                return a[mid];
            }
        }
        return -1;
    }

}

