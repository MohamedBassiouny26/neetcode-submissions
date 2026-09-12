class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        # First solution using sort then loop through the array and check if current num==prev_num+1
        sorted_nums=sorted(nums)  
        current_length=0
        result=0
        for i in range(1,len(sorted_nums)):
            current_num=sorted_nums[i]
            prev_num=sorted_nums[i-1]
            if prev_num+1==current_num:
                current_length+=1
            elif  prev_num!=current_num:
                current_length=0
            result=max(result,current_length)
            
        return result+1 if len(nums)>0 else 0