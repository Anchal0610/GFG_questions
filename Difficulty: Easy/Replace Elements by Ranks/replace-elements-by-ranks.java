class Solution {
    static class Rank{
        int val;
        int idx;
        Rank(int val , int idx){
            this.val = val;
            this.idx = idx;
        }
    }
    public void replaceWithRank(int[] arr) {
        // code here
        PriorityQueue<Rank> pq = new PriorityQueue<>((a,b) ->{
            if(a.val != b.val){
                return Integer.compare(a.val , b.val);
            }
            return Integer.compare(a.idx , b.idx);
        });
        for(int i=0 ; i<arr.length ; i++){
            pq.add(new Rank(arr[i] , i));
        }
        int rank =0;
        while(pq.size() > 0){
            Rank curr = pq.poll();
            arr[curr.idx] = rank;
            rank++;
        }
        
    }
}