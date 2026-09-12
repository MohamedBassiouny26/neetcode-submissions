class Solution {
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<int[]> closestDistances = new PriorityQueue<>((a, b) -> Integer.compare(
           b[0] * b[0] + b[1] * b[1],
           a[0] * a[0] + a[1] * a[1]
       ));
       for (int[] point : points) {
           closestDistances.add(point);
           if (closestDistances.size() > k) {
               closestDistances.poll();
           }
       }
       int[][] result = new int[k][2];
       while (k > 0) {
           result[--k] = closestDistances.poll();
       }
       return result;
    }
}
