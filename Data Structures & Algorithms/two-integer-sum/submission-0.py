class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        search_for={}
        for i,num in enumerate(nums):
            if num in search_for:
                return [search_for[num],i]
            search_for[target-num]=i