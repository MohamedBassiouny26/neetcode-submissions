from copy import copy
class Solution:
    res=[]
    seen={}
    # and tuple(found) not in self.seen:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        self.res=[]
        self.seen={}
        for i in range(0,len(nums)):
            found=self._backtracking(nums=nums,index=i,current_sum=target,current_path=[])
            if found:
                self.res.append(found)
        return self.res

    def _backtracking(self,nums:List[int],index:int,current_sum:int,current_path:List[int]):
        calc=current_sum-nums[index]
        current_path_copy=copy(current_path)
        current_path_copy.append(nums[index])
        if calc==0:
            return current_path_copy
        if calc<0:
            return []
        for j in range(index,len(nums)):
            found=self._backtracking(nums=nums,index=j,current_sum=calc,current_path=current_path_copy)
            if found:
                self.res.append(found)
        return []
        

