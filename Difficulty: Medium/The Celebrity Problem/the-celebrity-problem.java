class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int top = 0 , down = mat[0].length -1;
        while(top < down){
            if(mat[top][down] == 1){
                top = top+1;
            }
            else{
                down = down -1;
            }
        }
        if(top > down){
            return -1;
        }
        for(int i=0 ; i<mat.length ; i++){
            if(i==top){
                continue;
            }
            if(mat[top][i] == 0 && mat[i][top] == 1){
                continue;
            }
            else{
                return -1;
            }
        }
        return top;
    }
}