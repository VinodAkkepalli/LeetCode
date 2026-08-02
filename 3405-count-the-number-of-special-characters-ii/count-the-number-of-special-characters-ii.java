class Solution {
    public int numberOfSpecialChars(String word) {

        int count = 0;
        char c;

        int[] cUpper = new int[26];
        int[] cLower = new int[26];

        for(int i = 0; i <26;i++) {
            cUpper[i] = -1;
            cLower[i] = -1;
        }

        for(int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            if(Character.isUpperCase(c)) {
                if(cUpper[c- 'A'] == -1) {
                    cUpper[c- 'A'] = i;
                }
            } else {
                cLower[c- 'a'] = i;
            }
        }

        for(int i = 0; i < 26; i++) {
            if(cUpper[i] > -1 && cLower[i] > -1) {
                if(cLower[i] < cUpper[i]) {
                    count++;
                }
            }
        }
        
        return count;
    }
}