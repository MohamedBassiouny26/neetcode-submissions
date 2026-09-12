class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        last_seen_index={} 
        start=0
        res=0
        for end in range(len(s)):
            end_c_index=last_seen_index.get(s[end],-1)
            if start<=end_c_index<=end: # check if there's a duplicate character
                start=last_seen_index[s[end]]+1
            res=max(res,end-start+1)
            last_seen_index[s[end]]=end
        return res
            
        


     