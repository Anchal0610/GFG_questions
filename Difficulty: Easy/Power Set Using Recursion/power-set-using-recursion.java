class Solution {
    public ArrayList<String> powerSet(String s) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        int n = s.length();
        int p_size = 1<<n ;
        for(int i=0 ; i< p_size ; i++){
            String temp = "";
            for(int j =0 ; j<s.length() ; j++){
                if((i & (1<<j)) != 0){
                    temp += s.charAt(j);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
