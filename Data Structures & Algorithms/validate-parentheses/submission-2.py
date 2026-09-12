class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        openning=["{","[","("] 
        close=["}","]",")"]
        for c in s:
            if c in openning:
                stack.append(c)
            if c in close:
                if not len(stack): return False
                latest=stack.pop()
                if openning.index(latest) != close.index(c):
                    return False
        return len(stack)==0

        