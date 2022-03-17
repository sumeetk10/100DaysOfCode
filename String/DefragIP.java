public class DefragIP {
    public static void main(String[] args) {
        
        String address = "255.100.50.0";
        System.out.println("255.100.50.0");
        System.out.println(solution(address));
    }
    
    static String solution(String address) {
            
            String str = "";
            for(int i=0; i< address.length(); i++) {
                
                //char ch = address.charAt(i);
                
                if(address.charAt(i) == '.') {
                    str += "[.]";
                }
                else {
                    str += address.charAt(i);
                }
            }
            return str;
    }
}

