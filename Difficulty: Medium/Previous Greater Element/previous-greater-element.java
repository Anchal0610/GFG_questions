class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<Integer> s = new ArrayDeque<>();
        
        s.push(arr[0]);
        res.add(-1);
        for(int i= 1 ; i< arr.length ; i++){
            int pge = -1;
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }
            pge = s.isEmpty() ? -1 : s.peek();
            res.add(pge);
            s.push(arr[i]);
        }
        return res;
    }
}