class Solution:
    def isPalindrome(self, s: str) -> bool:
        left=0
        right=len(s)-1
        while left<right:
            left_c=s[left].lower()
            right_c=s[right].lower()
            if not left_c.isalnum():
                left+=1
            elif not right_c.isalnum():
                right-=1
            elif left_c!=right_c:
                return False
            else:
                left+=1
                right-=1
        return True
            


        