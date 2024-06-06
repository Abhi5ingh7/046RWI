import java.util.Arrays;

public class ExampleOfArray4 {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        
        if (n == 0) {
            return 0;
        }

        // Sort the array first
        Arrays.sort(nums);

        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 2, 5, 6, 2, 9, 9, 9, 7};
        int newLength = ExampleOfArray4.removeDuplicates(nums);
        
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
