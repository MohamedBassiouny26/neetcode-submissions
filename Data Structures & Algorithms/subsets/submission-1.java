class Solution {
    int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums=nums;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            backtracking(result,i,new ArrayList<>());
        }
        result.add(new ArrayList<>());
        return result;
    }
    private void backtracking(List<List<Integer>> result,int idx,List<Integer> prevNumbers){
        prevNumbers.add(nums[idx]);
        for(int i=idx+1;i<nums.length;i++){
            backtracking(result,i,prevNumbers);
        }
        result.add(new ArrayList<>(prevNumbers));
        prevNumbers.removeLast();
    }
}
