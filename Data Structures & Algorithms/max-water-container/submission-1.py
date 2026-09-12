class Solution:
    # Input: height = [1,7,2,5,4,7,3,6]
    # Output: 36
    # water_amount=(j-i)*min(height[i],height[j])
    def maxArea(self, heights: List[int]) -> int:
        max_water_amount=0
        left=0
        right=len(heights)-1
        while left<right:
            left_h=heights[left]
            right_h=heights[right]
            current_water_amount=(right-left)*min(left_h,right_h)
            max_water_amount=max(current_water_amount,max_water_amount)
            if left_h<=right_h:
                left+=1
            else:
                right-=1
        return max_water_amount

        