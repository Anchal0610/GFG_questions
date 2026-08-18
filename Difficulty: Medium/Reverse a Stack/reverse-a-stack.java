class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return;
        }
        int temp = st.pop();
        reverseStack(st);
        insert(st , temp);
    }
    private static void insert( Stack<Integer> st , int elem){
        if(st.isEmpty()){
            st.push(elem);
            return;
        }
        int topelem = st.pop();
        insert(st , elem);
        st.push(topelem);
    }
}
