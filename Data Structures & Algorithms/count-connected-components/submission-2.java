class Solution {
    Set<Integer> visited;
    public int countComponents(int n, int[][] edges) {
        Map<Integer,List<Integer>> graph=createAdjList(n,edges);
        visited=new HashSet<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited.contains(i)){
                dfs(i,graph);
                count++;
            }
        }
        return count;
    }
    private Map<Integer,List<Integer>> createAdjList(int n,int[][] edges){
        Map<Integer,List<Integer>> graph=new HashMap<>();
        for(int[] edge:edges){
            graph.put(edge[0],new ArrayList());
            graph.put(edge[1],new ArrayList());
        }
        for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }
    private void dfs(int n, Map<Integer,List<Integer>> graph){
        if(!visited.add(n)) return;
        List<Integer> adj=graph.get(n) != null ? adj=graph.get(n):new ArrayList<>();
        for(Integer adjNode:adj){
            dfs(adjNode,graph);
        }
        return;
    }
}
