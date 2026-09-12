class Solution {
    PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
    public int lastStoneWeight(int[] stones) {
        for(int stone:stones){
            pq.add(stone);
        }
        while(pq.size()>1){
            int largestStone=pq.poll();
            int secondLargestStone=pq.poll();
            int diff=largestStone-secondLargestStone;
            pq.add(diff);
        }
        return pq.peek();
    }
}
