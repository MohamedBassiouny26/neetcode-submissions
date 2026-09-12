class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        last_seen_index={} 
        start=0
        end=0
        res=0
        window_size=0
        while end<len(s):
            print(start,end)
            print(window_size)
            print(last_seen_index)
            start_c=s[start]
            end_c=s[end]
            end_c_index=last_seen_index.get(end_c,-1)
            if start<=end_c_index<=end:
                start=last_seen_index[end_c]+1
                start_c=s[start]
            window_size=(end-start)+1
            print("after:",window_size)

            res=max(res,window_size)
            last_seen_index[start_c]=start
            last_seen_index[end_c]=end
            end+=1
        return res
            
        


     