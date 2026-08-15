class Solution {
    public static int getMaxArea(int arr[] , int C) {
        // code here
        ArrayDeque<Integer> s = new ArrayDeque<>();
        int maxarea = 0;
        for(int i=0 ; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                int ele = s.peek();
                s.pop();
                int nse = i;
                int pse = s.isEmpty() ? -1 : s.peek();
                maxarea = Math.max(arr[ele] * (nse-pse-1) , maxarea);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int nse = arr.length;
            int ele = s.peek();
            s.pop();
            int pse = s.isEmpty() ? -1 : s.peek();
            maxarea = Math.max(arr[ele] * (nse-pse-1) , maxarea);
        }

        return maxarea;
    }
    public int maxArea(int mat[][]) {
        int R = mat.length;
        int C = mat[0].length;
        // code here
        int res = getMaxArea(mat[0] , C);
        for(int i=1 ; i<R ; i++){
            for(int j = 0; j<C ; j++){
                if(mat[i] [j] == 1){
                    mat[i][j] += mat[i-1][j];
                }
            }
            res = Math.max(res , getMaxArea(mat[i] , C));
        }
        
        return res;
        
    }
}