import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] indices = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(target - nums[index])) {
                indices[1] = index;
                indices[0] = map.get(target - nums[index]);
                return indices;
            }
            map.put(nums[index], index);
        }
        return indices;
    }
}
public class twosum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        // Read the target value from the user
        System.out.print("Enter the target value: ");
        int target = obj.nextInt();
        
        // Read the array of numbers from the user
        System.out.print("Enter the length of the array: ");
        int length = obj.nextInt();
        int[] nums = new int[length];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < length; i++) {
            nums[i] = obj.nextInt();
        }
        
        // Find the indices of the two numbers that add up to the target value
        Solution solution = new Solution();
        int[] indices = solution.twoSum(nums, target);
        
        // Print the results
        if (indices.length == 2) {
            System.out.println("The indices are " + indices[0] + " and " + indices[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
