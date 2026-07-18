class Solution {
    public static int countSubstring(String s) {
        // code here
        int lastA = -1;
        int lastB = -1;
        int lastC = -1;
        int count =0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == 'a'){
                lastA =i;
            }
            else if(s.charAt(i) == 'b'){
                lastB = i;
            }
            else{
                lastC = i;
            }
            
             if(lastA != -1 && lastB != -1 && lastC != -1){
                count += Math.min(lastA ,Math.min( lastB , lastC ))+1;  
            }
        }
        
        return count;
    }
}
