class Solution {
    public boolean validTree(int n, int[][] edges) {
         int[] nodes=new int[n];
         for(int i=0;i<n;i++) nodes[i]=i;
         for(int[] edge:edges){
            if(!union(edge[0],edge[1],nodes)) return false;
         }
        int root=nodes[0];
        for(int i=0;i<n;i++) if(nodes[i]!=root) return false;

        
        // Set<Integer> visited=new HashSet<>();
        // Map<Integer,List<Integer>> graph=generateAdjList(edges,n);
        // for(int i=0;i<n;i++){
        //     if(graph.get(i).isEmpty()) return false;
        // }
        // return dfs(graph,visited,0,-1);
        return true;
    }

    private boolean union(int n1,int n2,int[] nodes){
        if(findRoot(n1,nodes)==findRoot(n2,nodes)) return false;
        nodes[findRoot(n2,nodes)]=findRoot(n1,nodes);
        return true;
    }
    private int findRoot(int n,int[] nodes){
        if(nodes[n]==n) return n;
        return findRoot(nodes[n],nodes);
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
