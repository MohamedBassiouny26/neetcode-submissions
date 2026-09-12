class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        # result -> 1
        # {}
        num_set=set(nums) 
        result=0
        for num in nums:
            if num-1 not in num_set:
                length=1
                current_num=num+1
                while True:
                    if current_num in num_set:
                        length+=1
                    else:
                        break    
                    current_num+=1
                result=max(result,length)
        return result 