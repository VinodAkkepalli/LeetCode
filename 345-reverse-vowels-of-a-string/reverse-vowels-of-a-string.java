class Solution {
    public String reverseVowels(String s) {
        char[] sArr = s.toCharArray();
        int strLen = s.length();
        int left = 0;
        int right = strLen-1;
        char temp;

        while(left < right) {
            while(left < strLen && !isVowel(sArr[left])) {
                left++;
            }

            while(right > -1 && !isVowel(sArr[right])) {
                right--;
            }

            if(left < right) {
                temp = sArr[left];
                sArr[left] = sArr[right];
                sArr[right] = temp;
            }
            left++;
            right--;
        }

        return new String(sArr);
        
    }

    public boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}