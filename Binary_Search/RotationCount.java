public class RotationCount {
    public static void main(String[] args) {
        int[] arr =/*{4,5,6,7,9,11,2};*/{12,8,6,4,2,9};
        System.out.println(pivot(arr)+1);
        
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start + (end-start)/2;

            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            
            if(arr[start] > arr[mid]){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }

    
}
