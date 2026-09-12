# Assumption
# it should be same characters and same count of characters
# Proposed solution 1
    #we can loop through first string & save it in hash with the count of every char
    #Then loop through the second and start remove from the hash and if hash size is zero so it's the same
    # mem O(N)
    # complexity O(N)
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        occurrance_count=dict()
        for c in s: 
            current_count=occurrance_count.get(c,0) 
            occurrance_count[c]=current_count+1

        for c in t:
            current_count=occurrance_count.get(c,0) #1
            if current_count<=0:
                return False
            occurrance_count[c]-=1
            if occurrance_count[c] == 0:
                del occurrance_count[c]
        return len(occurrance_count)==0 




        
        