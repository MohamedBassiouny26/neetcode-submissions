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

        countS={} 
        countT={}
        for i in range(0,len(s)):
            countS[s[i]]=countS.get(s[i],0) + 1
            countT[t[i]]=countT.get(t[i],0) + 1
        return countS==countT






        
        