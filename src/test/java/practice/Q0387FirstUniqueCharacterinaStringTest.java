package practice;

import org.junit.Test;

/**
 * Created by fxd on 2018/9/8.
 */
public class Q0387FirstUniqueCharacterinaStringTest {

    @Test
    public void test() {
        Q0387FirstUniqueCharacterinaString work = new Q0387FirstUniqueCharacterinaString();
        String[] strs = {"dacca", "dacca", "leetcode", "loveleetcode", null, ""};
        for (String str : strs) {
            System.out.println(work.firstUniqChar(str));
        }
    }
}
