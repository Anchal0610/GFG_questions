class Solution {
    boolean graphColoring(int v, int[][] edges, int m) {
        // code here
        int[] color = new int[v];
        if(solve(0 , v , m , color , edges)==true) return true;
        return false;
    }
    
    private boolean solve(int node , int v , int m , int[] color , 
    int[][]  edges){
        if(node == v){
            return true;
        }
        for(int col = 1 ; col<=m ; col++){
            if(isSafe(node , col , color , edges)){
                color[node] = col;
                
                if(solve(node+1 , v , m , color , edges)){
                return true;
                }
                color[node]=0;
            }
        }
        return false;
    }
    private boolean isSafe(int node , int col , int[]color , int[][] edges){
        for(int []edge : edges){
            if(edge[0] == node && color[edge[1]] == col){
                return false;
            }
            if(edge[1] == node && color[edge[0]] == col ){
                return false;
            }
        }
        return true;
    }
    
}