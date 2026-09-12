class Solution {
    int[] parent;
    public int countComponents(int n, int[][] edges) {
        parent=new int[n];
        int count=n;
        for(int i=0;i<n;i++) parent[i]=i;
        for(int[] edge:edges){
            int firstRoot=find(edge[0]);
            int secondRoot=find(edge[1]);
            if(firstRoot!=secondRoot){
                parent[firstRoot]=secondRoot;
                count--;
            }
        }
        return count;
    }
    private int find(int x){
        if(parent[x] != x)
            return find(parent[x]);
        return x;
    }
}
