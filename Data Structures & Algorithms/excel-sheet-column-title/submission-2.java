class Solution {
    public String convertToTitle(int col) {
      StringBuilder sb=new StringBuilder();
      while(col>0){
        int rem=(col-1)%26;
        char a=(char)(rem+'A');
        col=(col-1)/26;
        sb.append(a);
      }
      return sb.reverse().toString();
    }
}