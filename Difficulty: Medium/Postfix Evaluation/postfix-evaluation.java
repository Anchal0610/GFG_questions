class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int i=0 ; i<arr.length ; i++){
           String x = arr[i];
           
           if(x.equals("+") || x.equals("-") || x.equals("*") 
            || x.equals("/") || x.equals("^")){
               int b = st.pop();
               int a = st.pop();
               
               int result =0;
               
               if(x.equals("+")){
                   result = a+b;
               }
               else if(x.equals("-")){
                   result = a-b;
               }
               else if(x.equals("*")){
                   result = a*b;
               }
               else if(x.equals("/")){
                   result = (int)Math.floor((double)a/b);
               }
               else if(x.equals("^")){
                   result = (int)Math.pow(a ,b);
               }
               st.push(result);
           }
           else{
               st.push(Integer.parseInt(x));
           }
        }
        return st.peek();
    }
}