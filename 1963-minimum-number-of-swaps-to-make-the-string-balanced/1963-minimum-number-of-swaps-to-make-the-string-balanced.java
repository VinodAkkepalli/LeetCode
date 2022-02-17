class Solution {
    public int minSwaps(String s) {
        int count = 0;
        int maxCount = 0;
        int sLen = s.length();
        
        for(int i = 0; i<sLen; i++ ) {    
            if(s.charAt(i) == ']') {
                count++;
                maxCount = Math.max(maxCount, count);
            } else if(s.charAt(i) == '[') {
                count--;
            }
        }
        return (maxCount+1)/2;
    }
}