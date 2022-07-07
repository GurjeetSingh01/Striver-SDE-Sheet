class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++) {
                int result = nums[i] + nums[j];
                if (i != j && result == target){
                    int[] arr = {i, j};
                    return arr;
                }
            }
        }
        return null;
    }
}