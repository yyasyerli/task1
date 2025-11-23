
class Solution {


    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        outerloop:
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target){
                    sum[0] = i;sum[1]=j;
                    System.out.println("Çö züm: ["+i +","+ j+"]");
                    break outerloop;
                }
            }
        }
        return sum;

    }

}
