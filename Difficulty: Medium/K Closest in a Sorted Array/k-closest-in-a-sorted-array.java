class Solution {
    static class doublet{
        int point;
        int dist;
        doublet(int point , int dist){
            this.point = point;
            this.dist = dist;
        }
    }
    public ArrayList<Integer> findKClosest(int[] arr, int k, int x) {
        // code here
        PriorityQueue<doublet> pq = new PriorityQueue<>((a,b) ->
        Integer.compare(b.dist , a.dist)
        // { if(a.dist != b.dist){
        //     return Integer.compare(b.dist , a.dist);
            
        //   }
        //   return Integer.compare(a.point , b.point);
        // }
        );
        for(int ele : arr){
            if (ele == x) 
            {continue;}
            int point = ele;
            int dist =  Math.abs(point - x);
            pq.add(new doublet(point , dist));
            if(pq.size() > k){
                pq.remove();
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(!pq.isEmpty()){
            doublet top = pq.remove();
            ans.add(top.point);
        }
        ans.sort((a, b) -> {
                    int da = Math.abs(a - x);
                    int db = Math.abs(b - x);

                    if (da != db) {
                        return Integer.compare(da, db);
                    }

                    return Integer.compare(b, a);
                });

        return ans;
    }
}