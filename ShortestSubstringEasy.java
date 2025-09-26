import java.util.*;

public class ShortestSubstringEasy {
    public static int shortestSubstring(String s) {
        Set<Character> distinctChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            distinctChars.add(s.charAt(i));
        }

        int required = distinctChars.size();
        int minLen = s.length();
        for (int i = 0; i < s.length(); i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                seen.add(s.charAt(j));
                if (seen.size() == required) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }

        return minLen;
    }

    public static void main(String[] args) {
        System.out.println(shortestSubstring("dabbcabcd"));
        System.out.println(shortestSubstring("asdfkjeghfalawefhaef"));
    }
}
    

