class Solution {
    public String greatestLetter(String s) {
        String ans = "";
        boolean[] capArr = new boolean[26];
        boolean[] smallArr = new boolean[26];
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            if( c >= 'a') {
                smallArr[c-'a'] = true;
            } else {
                capArr[c-'A'] = true;
            }
        }

        for (int i = 25; i >-1 ; i--) {
            if(capArr[i] && smallArr[i]) {
                ans = String.valueOf((char)(i + 65) );
                break;
            }
        }

        return ans;
    }
}