

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {2,4,6 ,7 ,8 ,9 ,11,6,1};
        int target = 5;
        int start =0;
        int end = arr.length-1;
        int ans = Peak(arr,start,end);
        int ans2 = BinarySearch(arr,target,start,ans);
        // if(ans2 != -1){
        //     return;
        // }
        System.out.println(ans2);
        
    }

    static int Peak(int[] a, int start, int end)
    {
        // // return the index
        // int start = 0;
        // int end = a.length-1;

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
                return mid;
            }
        }
        return start;
    }


    static int BinarySearch(int[] a, int target,int start,int end)
    {
        // // return the index
        // int start = 0;
        // int end = a.length-1;

        while(start < end)
        {
            int mid = start+(end-start)/2;
            if(a[mid] > target)
            {
                end = mid;
            } else if(a[mid] < target){
                start = mid;

            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
