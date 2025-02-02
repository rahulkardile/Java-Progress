import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = { 2, 7, 9, 11 };
        solution.twoSum(arr, 9);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];

            if (map.containsKey(remaining)) {
                arr[0] = map.get(remaining); 
                arr[1] = i;
                return arr;
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
