class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        int repeating = -1;
        long actual_sum =0;
        long expected_sum = (1L * n*(n+1)) / 2;
        for(int i=0 ; i<n ; i++){
            actual_sum += arr[i];
            map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 2){
                repeating = entry.getKey();
                break;
            }
        }
        int missing_num = (int)(expected_sum - actual_sum + repeating);
        list.add(repeating);
        list.add(missing_num);
        
        return list;
    }
}
