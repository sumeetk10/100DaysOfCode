import java.util.HashMap;
import java.util.Map;




public class RomanToInt {
    public static void main(String[] args) {
        String s = "IIIMC";
        System.out.println(toInteger(s));;
    }

    static int toInteger(String s) {

        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length()-1));

        for(int i=s.length()-2; i>=0; i--) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i))) {
                result -= map.get(s.charAt(i));
            }
            else {
                result += map.get(s.charAt(i));
            }

        }

        return result;
    }
}
