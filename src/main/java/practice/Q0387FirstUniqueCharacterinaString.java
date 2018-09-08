package practice;

/**
 * Given a string, find the first non-repeating character in it
 * and return it's index. If it doesn't exist, return -1.
 * You may assume the string contain only lowercase letters.
 */
public class Q0387FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        if (null == s || "".equals(s)) {
            return -1;
        }

        int[] charNum = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charNum[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (1 == charNum[s.charAt(i) - 'a']) {
                return i;
            }
        }
        return -1;
    }
}
