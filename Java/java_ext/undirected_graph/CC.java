package java_ext.undirected_graph;
public class CC{
    private int[] marked;
    private int[] edgeTo;
    private int count;
    private int[] ids;
    
    public CC(Graph G){
        ids = new int[G.V()];
        for(int i=0; i<G.V(); i++){
            if(!marked[i]){
                dfs(G,i);
                count ++;
            }
        }
    }
    private void dfs(Graph G, int s){
        marked[s] = true;
        ids[s] = count;
        for(int w in G.adj(s)){
            if(!marked[w]){
                dfs(G, w);
            }
        }
    }
    
    public Boolean isSameCC(int w, int v){
        return ids[w]==ids[v];
    }
}