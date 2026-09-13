class Solution {
    public String minWindow(String s1, String s2) {
        // code here
        int r = 0;
        int minlen = Integer.MAX_VALUE;
        int start = -1;
        while( r < s1.length()){
            int j = 0;
            while(r < s1.length()){
                if(s1.charAt(r) == s2.charAt(j)){
                    j++;
                }
                if(j == s2.length()){
                    break;
                }
             r++;
            }
            if(j != s2.length()){
                break;
            }
            int l  = r;
            j  = s2.length()-1;
            while(j >= 0){
                if(s1.charAt(l) == s2.charAt(j)){
                    j--;
                }
                l--;
            }
            l++;
            
            if(r-l+1 < minlen){
                minlen = r-l+1;
                start = l;
            }
            r = l+1;
        }
        return start != -1 ? s1.substring(start , start+minlen) :"";
    }
}
