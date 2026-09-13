class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int indx = 0;
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k){
                arr[indx++]= pq.remove();
            }
        }
        while(pq.size() > 0){
                arr[indx++] = pq.remove();
            }
    }
}
