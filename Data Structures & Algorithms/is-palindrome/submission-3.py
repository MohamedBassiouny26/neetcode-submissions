class Solution:
    def isPalindrome(self, s: str) -> bool:
        left=0
        right=len(s)-1
        while left<=right:
            c1=s[left]
            c2=s[right]
            if c1.isalnum() and c2.isalnum() and not c1.lower()==c2.lower():
                return False
            if c1.isalnum() and c2.isalnum():
                left+=1
                right-=1
            if not c1.isalnum():
                left+=1
            if not c2.isalnum():
                right-=1
                
        return True
