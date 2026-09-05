import java.util.Arrays;

public class Problem5W4P4 {

    public static int[] rotateArray(int[] nums, int k) {

        int n = nums.length;

        // Reduce k
        k = k % n;

        int[] result = new int[n];

        // Place each element in its new position
        for (int i = 0; i < n; i++) {

            int newPosition = (i + k) % n;

            result[newPosition] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int[] result = rotateArray(nums, k);

        System.out.println(Arrays.toString(result));
    }
}