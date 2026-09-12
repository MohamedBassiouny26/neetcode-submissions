class Solution:
    # Input: height = [1,7,2,5,4,7,3,6]
    # Output: 36
    # water_amount=(j-i)*min(height[i],height[j])
    def maxArea(self, heights: List[int]) -> int:
        max_water_amount=0
        for i in range(0,len(heights)):
            for j in range(i,len(heights)):
                current_water_amount=(j-i)*min(heights[i],heights[j])
                max_water_amount=max(current_water_amount,max_water_amount)
        return max_water_amount

        