class Solution {
    public static int precedence(char ch){
        if(ch =='^'){
            return 3;
        }
        else if(ch =='*' || ch == '/'){
            return 2;
        }
        else if(ch == '+' || ch == '-'){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static String infixToPostfix(String s) {
        // code here
        StringBuilder ans = new StringBuilder();
        ArrayDeque<Character> st = new ArrayDeque<>();
        
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            }
            else if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() 
                && st.peek() != '(' 
                && (precedence(st.peek()) > precedence(ch)
                || (precedence(st.peek()) == precedence(ch)
                && ch != '^'))){
                    ans.append(st.pop());
                }
                
                st.push(ch);
            }
                
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        
        return ans.toString();
        
    }
}