class Solution {
     public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>>  result =new HashSet<>();
        solve(nums,0,new ArrayList<Integer>(),result);
        return new ArrayList<>(result);
    }
    
    public void solve(int[] arr,int pos,ArrayList<Integer> op,Set<List<Integer>> result){
        if(pos==(arr.length)){
            result.add(op);
            return;
        }
     
        ArrayList<Integer> op1=new ArrayList<>();
        op1.addAll(op);
        op1.add(arr[pos]);
        solve(arr,pos+1,op1,result);
        solve(arr,pos+1,op,result);
        return;

    }
}