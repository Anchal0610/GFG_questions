class Solution {
    static class Data{
        int start , end , pos;
        Data(int start , int end , int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int N = s.length;
        Data []arr = new Data[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = new Data(s[i] , f[i] , i+1);
        }
        Arrays.sort(arr, (a,b) -> Integer.compare(a.end , b.end));
        int cnt = 1;
        int freetime = arr[0].end;
        ans.add(arr[0].pos);
        for(int i=1 ; i<N ; i++){
            if(arr[i].start > freetime){
                cnt = cnt+1;
                freetime = arr[i].end;
                ans.add(arr[i].pos);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}