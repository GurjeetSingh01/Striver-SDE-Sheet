class Solution{
public int findDuplicate(int[] nums){
HashMap<Integer, Integer> mp = new HashMap<>();
int n = nums.length;
for(int i =0; i<nums.length; i++){
if(mp.containsKey(nums[i]))
return nums[i];
else {
mp.put(nums[i], 1);
}}
return -1;
}}
