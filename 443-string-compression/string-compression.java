class Solution {
    public int compress(char[] chars) {
        int p1 = 0;
        int p2 = 0;
        int i = 0;
        int cLen = chars.length;
        int count = 0;

        while(i < cLen) {
            p1 = i;            
            while(i < cLen && chars[i] == chars[p1]) {
                i++;
            }
            if(i-p1 == 1) {
                count++;
                chars[p2] = chars[p1];
                p2++;
            } else {
                p2 = fillChars(chars, p1, p2, i);
                count+= (String.valueOf(i-p1)).length()+1;
            }
        }
        return count;
    }

    public static int fillChars(char[] chars, int p1, int p2, int i) {
        int charCount = i-p1;
        chars[p2] = chars[p1];
        p2++;

        for(char c: String.valueOf(charCount).toCharArray()) {
            chars[p2] = c;
            p2++;
        }

        return p2;
    }
}