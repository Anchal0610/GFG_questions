class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(0);
        res.add(1);
        
        for(int i=1 ; i< arr.length ; i++){
            int span = 1 ;
            while(s.isEmpty() == false && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            span = s.isEmpty() ? i+1 : i-s.peek();
            res.add(span);
            
            s.push(i);
        }
        
        return res;
        
    }
}