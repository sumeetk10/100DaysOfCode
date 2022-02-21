import java.util.Scanner;

public class Algo {
    public static void main(String[] args) {
        int[] a ={-10,-3,0,2,4,7,8,11,14,18,23,45,67,89};
        int target = 1;

        int ans = BinarySearch(a, target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] a, int target)
    {
        // return the index
        int start = 0;
        int end = a.length-1;

        while(start <= end)
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
