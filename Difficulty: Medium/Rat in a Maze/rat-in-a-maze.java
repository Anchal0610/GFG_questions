class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        int[] di = {1 , 0 , 0 , -1};
        int[] dj = {0, -1, 1, 0};
        int n = maze.length;
        int[][] visit = new int[n][n];
        if(maze[0][0] == 1){
            findPath(0, 0, maze , ans , visit ,"" , di , dj);
        }
        return ans;
    }
    public void findPath(int i , int j ,int[][] maze ,List<String> ans ,
    int[][] visit, String move , int[] di , int[] dj){
        if(i== maze.length-1 && j== maze.length-1){
            ans.add(move);
            return;
        }
        // //down
        // if(i+1<n && !visit[i+1][j] && maze[i+1][j] == 1){
        //     visit[i][j] == 1;
        //     findPath(i+1 , j , maze , ans , visit , move+'D');
        //     visit[i][j] == 0;
        // }
        // //left
        // if(j-1>=0 && !visit[i][j-1] && maze[i][j-1] == 1){
        //     visit[i][j] == 1;
        //     findPath(i , j-1 , maze , ans , visit , move+'L');
        //     visit[i][j] == 0;
        // }
        // //right
        // if(j+1<n && !visit[i][j+1] && maze[i][j+1] == 1){
        //     visit[i][j] == 1;
        //     findPath(i , j+1 , maze , ans , visit , move+'R');
        //     visit[i][j] == 0;
        // }
        // //up
        // if(i-1>=0 && !visit[i-1][j] && maze[i-1][j] == 1){
        //     visit[i][j] == 1;
        //     findPath(i-1 , j , maze , ans , visit , move+'U');
        //     visit[i][j] == 0;
        
        String dir = "DLRU";
        for(int ind = 0 ; ind <4 ; ind++){
            int nexti = i+ di[ind];
            int nextj = j + dj[ind];
            
            if(nexti >=0 && nextj >=0 && nexti < maze.length 
            && nextj < maze.length && visit[nexti][nextj] == 0
            && maze[nexti][nextj] == 1){
                visit[i][j] = 1;
                findPath(nexti , nextj ,maze , ans , visit , 
                move+dir.charAt(ind) , di , dj);
                visit[i][j] = 0;
            }
        
        }
        
    }
}