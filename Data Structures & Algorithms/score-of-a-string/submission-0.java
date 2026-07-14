class Solution {
    public int scoreOfString(String s) {
        int i=1;
        int sub=0;
        int add=0;
        while(i<s.length()){
        int prev=s.charAt(i-1);
        int current=s.charAt(i);
            sub=Math.abs(current-prev);
            add+=sub;
            i++;
        }
        return add;
    }
}