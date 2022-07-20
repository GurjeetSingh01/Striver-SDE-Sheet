class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target){

        List<List<Integer>> ans = new ArrayList<>();

        combinationSumhelper(0,candidates,target,ans, new ArrayList<Integer>());

        return ans ;
    }

    // similar concept of taking and not taking
    public void  combinationSumhelper( int index ,int[] candidates, int target, List<List<Integer>> ans , List<Integer> insideList){
        if (index == candidates.length){
            if (target == 0){
                List<Integer> newInside = new ArrayList<>(insideList);
                ans.add(newInside);
            }

            return;
        }

        if (candidates[index] <= target){
            insideList.add(candidates[index]);
            // Taking the element
            combinationSumhelper(index,candidates,target-candidates[index],ans,insideList);
            // Backtracking
            insideList.remove(insideList.size() - 1);
        }
        // not taking the element
        combinationSumhelper(index+1,candidates,target,ans,insideList);
    }
}