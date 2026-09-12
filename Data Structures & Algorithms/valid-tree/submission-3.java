class Solution {
    public boolean validTree(int n, int[][] edges) {
        Set<Integer> visited=new HashSet<>();
        Map<Integer,List<Integer>> graph=generateAdjList(edges,n);
        System.out.println(visited);
        boolean ans= dfs(graph,visited,0,-1);
        for(int i=0;i<n;i++) if(!visited.contains(i)) return false;
        return ans;
    }
    private Map<Integer,List<Integer>> generateAdjList(int[][] edges,int n){
        Map<Integer,List<Integer>> graph=new HashMap<>();
        for(int i=0;i<n;i++){
            graph.put(i,new ArrayList<>());
        }
        for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }
    private boolean dfs(Map<Integer,List<Integer>> graph,Set<Integer> visited,int node,int parent){
        if(!visited.add(node)) return false;
        List<Integer> adjacency=graph.get(node);
        for(Integer adj:adjacency){
            if(adj==parent) continue;
            if(dfs(graph,visited,adj,node) ==false) return false;
        }
        return true;
    }
}
