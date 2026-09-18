class Solution {
    static class distance{
        int dist ;
        int x ;
        int y;
        distance(int dist , int x , int y){
            this.dist = dist;
            this.x = x;
            this.y = y;
        }
    }
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        
        PriorityQueue<distance> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.dist , a.dist));
        for(int[] point : points){
            int x = point[0] , y = point[1];
            int dist = x*x + y*y;
            pq.add(new distance(dist , x , y));
            if(pq.size() > k){
                pq.remove();
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while(! pq.isEmpty()){
            distance top = pq.remove();
            
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(top.x);
            temp.add(top.y);
            
            ans.add(temp);
        }
        return ans;
        
    }
}