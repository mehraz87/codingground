package java_ext.undirected_graph;
import java.util.ArrayList;
import Graph;
public class DFS{
    private int[] marked;
    private int[] edgeTo;
    
    public DFS(Graph G, int s)
    {
        marked[] = new int[G.V()];
        edgeTo[] = new int[G.V()];
        dfs(G, s);
    }
    
    private void dfs(Graph G, int s){
        marked[s] = true;
        for (int w : G.adj(s)){
            if(!marked[w]){
                edgeTo[w] = s;
                dfs(G, w);
            }
        }
    }
}