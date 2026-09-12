class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        last_seen_index={} 
        start=0
        end=0
        res=0
        while end<len(s):
            end_c=s[end]
            end_c_index=last_seen_index.get(end_c,-1)
            if start<=end_c_index<=end: # check if there's a duplicate character
                start=last_seen_index[end_c]+1
            res=max(res,end-start+1)
            last_seen_index[end_c]=end
            end+=1
        return res
            
        


     