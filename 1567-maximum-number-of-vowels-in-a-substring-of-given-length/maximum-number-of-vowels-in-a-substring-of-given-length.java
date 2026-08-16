class Solution {
    public int maxVowels(String s, int k) {

        int ans = 0;
        int count = 0;
        int i = 0;

        for(int j = 0; j < s.length(); j++) {

            if(isVowel(s.charAt(j))) {
                count++;
            }

            if(j-i+1 == k){
                ans = Math.max( ans, count);
                if(isVowel(s.charAt(i))){
                    count--;
                }
                i++;
            }
        }
        
        return ans;
    }

    public static boolean isVowel(char c) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
}