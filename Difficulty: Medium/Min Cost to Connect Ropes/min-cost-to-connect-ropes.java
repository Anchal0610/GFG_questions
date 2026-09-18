class Solution {
    public int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
        }
        int smallest = 0;
        int secondsmallest = 0;
        int cost = 0;
        while(pq.size() > 1){
            smallest = pq.remove();
            secondsmallest = pq.remove();
            int sum = smallest + secondsmallest;
            cost += sum;
            pq.add(sum);
        }
        if(pq.size() < 0){
            return 0;
        }
        return cost;
    }
}