public class CommanPrefix1 {
   public static void main(String[] args) {
       String[] str = {"flower","flow","flight"};

       String ans = longestCommonPrefix(str);
       System.out.println(ans);
    }
    
        public  static String longestCommonPrefix(String[] strs) {
            
            String commonPrefix = strs[0];
            
            for(int i = 1; i < strs.length; i++) {
                while(!strs[i].startsWith(commonPrefix)) {
                    commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                }
            }
            
            return commonPrefix;
            
        }
    
}
