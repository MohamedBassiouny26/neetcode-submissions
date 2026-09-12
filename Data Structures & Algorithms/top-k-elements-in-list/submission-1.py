import heapq

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        seen_count={}
        pq=[]
        res=set()
        for num in nums:
            seen_count[num]=seen_count.get(num,0) + 1
            heapq.heappush(pq,(-seen_count[num],num))
        while pq:
            priority, num = heapq.heappop(pq)
            res.add(num)
            if len(res)==k:
                break
        return list(res)

        