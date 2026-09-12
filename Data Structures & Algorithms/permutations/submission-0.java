class Solution {
    int[] nums;
    public List<List<Integer>> permute(int[] nums) {
        this.nums=nums;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            backtracking(result,i,new ArrayList<>(),new HashSet<>());
        }
        return result;
    }
    private void backtracking(List<List<Integer>> result,int idx,List<Integer> subset,Set<Integer> seen){
       if(seen.contains(idx)){
            return;
       }
       seen.add(idx);
       subset.add(nums[idx]);
       for(int i=0;i<nums.length;i++){
            backtracking(result,i,subset,seen);
       }
       if(subset.size()==nums.length) result.add(new ArrayList<>(subset));
       subset.removeLast();
       seen.remove(idx);
    }
}
