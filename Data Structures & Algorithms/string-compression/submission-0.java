class Solution {
    public int compress(char[] chars) {
        int newIndex=0;
        int i=0;

        while(i<chars.length){
            char currentChar=chars[i];
            int count=0;

            while(i<chars.length && chars[i]==currentChar){
                    count++;
                    i++;
            }
            chars[newIndex]=currentChar;
            newIndex++;

            if(count>1){
                String str=String.valueOf(count);
                for(char digit: str.toCharArray()){
                    chars[newIndex]=digit;
                    newIndex++;
                }
            }
        }

        return newIndex;

    }
}