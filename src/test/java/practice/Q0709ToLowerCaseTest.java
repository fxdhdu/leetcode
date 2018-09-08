package practice;

import org.junit.Test;

/**
 * Created by fxd on 2018/9/8.
 */
public class Q0709ToLowerCaseTest {

    @Test
    public void test() {
        Q0709ToLowerCase work = new Q0709ToLowerCase();
        String[] strs = {null, "", "Hello", "here", "LOVELY"};
        for (String str: strs) {
            System.out.println(work.toLowerCase(str));
        }
    }
}
