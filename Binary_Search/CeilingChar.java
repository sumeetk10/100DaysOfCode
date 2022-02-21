public class CeilingChar {
    public static void main(String[] args) {
        
        // find the smallest character that is greater than target
        char arr[] ={'a','c','f','k'};
        char target='c';
        char ans = CeilingCharacter(arr, target);
        System.out.println("output");
        System.out.println(ans);
    }

    static char CeilingCharacter(char[] arr, char target)
    {
        int start =0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            
        }

        return arr[start % arr.length];
    }
}
