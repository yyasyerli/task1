import java.util.ArrayList;

public class SolutionTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        System.out.println("Tüm testler başarılı görünüyor (Hata fırlatılmadıysa).");
    }

    private static void testCase1() {
        int[] nums = {2,7,11,15};
        Solution solution = new Solution();
        int target = 9;
        int[] output = solution.twoSum(nums, target);
        int index1 = nums[output[0]];
        int index2 = nums[output[1]];

        if (index1 + index2 != target) {
            throw new RuntimeException("Test Case 1 Başarısız: Beklenen: [0, 1] "  + ", Gerçekleşen " + output);
        }
        System.out.println("Test Case 1 Başarılı.");
    }

    private static void testCase2() {
        int[] nums = {3,2,4};
        Solution solution = new Solution();
        int target = 6;
        int[] output = solution.twoSum(nums, target);
        int index1 = nums[output[0]];
        int index2 = nums[output[1]];

        if (index1 + index2 != target) {
            throw new RuntimeException("Test Case 1 Başarısız: Beklenen: [0, 1] "  + ", Gerçekleşen " + output);
        }
        System.out.println("Test Case 2 Başarılı.");
    }

    private static void testCase3() {
        int[] nums = {3,3};
        Solution solution = new Solution();
        int target = 6;
        int[] output = solution.twoSum(nums, target);
        int index1 = nums[output[0]];
        int index2 = nums[output[1]];

        if (index1 + index2 != target) {
            throw new RuntimeException("Test Case 1 Başarısız: Beklenen: [0, 1] "  + ", Gerçekleşen " + output);
        }
        System.out.println("Test Case 3 Başarılı.");
    }

}

