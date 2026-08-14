class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(arr[arr.length-1]);
        res.add(-1);
        for(int i = arr.length-2 ; i>= 0 ; i--){
           int nge = -1;
           while(!s.isEmpty() && s.peek() <= arr[i]){
               s.pop();
           }
           nge = s.isEmpty() ? -1 : s.peek();
           res.add(nge);
           s.push(arr[i]);
        }
        Collections.reverse(res);
        
        return res;
    }
}