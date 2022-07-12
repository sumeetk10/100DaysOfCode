public class CommanPrefix {
    
    static int length(String[] s, int n) {

        int lenght1 = s[0].length();

        for( int i =0; i< n; i++) {

            if(lenght1 > s[i].length()) {
                lenght1 = s[i].length();
            }
        }
        return lenght1;
    }

    public static void main(String[] args) {
        
        String[] arr = {"flower", "flow", "flight"};
        int n = arr.length;

        String ans = prefix(arr,n);

        if(ans.length() > 0) {
            System.out.println(ans);
        }
        else {
            System.out.println("no comman prefix");
        }
    }

    public static String prefix(String[] arr, int n) {

        int minlength = length(arr, n);

        String result = "";
        char current;

        for (int i = 0; i < minlength; i++) {
            
            current = arr[0].charAt(i);

            for (int j = 1; j < n; j++) {
                
                if( arr[j].charAt(i) != current) {
                    return result;
                }
            }
        
           result += current;
        }
    
    return result;
}
}
