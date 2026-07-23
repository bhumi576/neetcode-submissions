class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='(') st.push(')');
            if(ch=='{') st.push('}');
            if(ch=='[') st.push(']');
            else if(ch==')' || ch=='}' || ch==']'){
                if(st.isEmpty() || st.pop()!=ch) return false;
            }
        }
        return st.isEmpty();
    }
}
