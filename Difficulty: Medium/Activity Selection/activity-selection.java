class Solution {
    static class Data{
        int start, end , pos;
        
        Data(int start , int end , int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }
    
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int N = start.length;
       Data []arr = new Data[N];
       for(int i=0 ; i<N ; i++){
           arr[i] = new Data(start[i], finish[i], i+1);
       }
       Arrays.sort(arr ,(a,b) -> Integer.compare(a.end , b.end) );
       int cnt = 1;
       int freetime = arr[0].end;
       
       
       for(int i=1 ; i<N ; i++){
           if(arr[i].start > freetime){
               cnt = cnt+1;
               freetime = arr[i].end;
           }
       }
       return cnt;
        
    }
}
