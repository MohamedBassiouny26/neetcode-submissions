class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l=0
        r=len(nums)-1
        while l<=r:
            left=nums[l]
            right=nums[r]
            mid=int((r-l)/2)+l
            middle=nums[mid]
            print(middle)
            if target==middle:
                return mid
            if left<=middle:
                if target>middle or target<left:
                    l=mid+1
                else:
                    r=mid-1
            else:
                if target<middle or target>right:
                    r=mid-1
                else:
                    l=mid+1 
        return -1 


