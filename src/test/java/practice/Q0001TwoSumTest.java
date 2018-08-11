package practice;


import org.junit.Test;
import org.junit.runner.Result;
import practice.Q0001TwoSum;

/**
 * Created by fxd on 2018/8/11.
 */
public class Q0001TwoSumTest {

    @Test
    public void test() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans = test.twoSum(nums, target);
        assert nums[ans[0]] + nums[ans[1]] == target;
    }
    
    private Q0001TwoSum test = new Q0001TwoSum();
}
