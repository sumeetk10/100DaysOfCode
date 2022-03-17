
public class ShuffleString {
    public static void main(String[] args) {
        
        String s = "codeleet"; 
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }

    static String restoreString(String s, int[] indices) {
        StringBuilder str = new StringBuilder(s);
        for(int i = 0; i< indices.length; i++) {
            
            str.setCharAt(indices[i], s.charAt(i));
           
            
        }

   return str.toString();
    }

}

