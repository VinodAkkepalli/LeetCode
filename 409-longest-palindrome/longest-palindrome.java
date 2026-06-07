class Solution {
    public int longestPalindrome(String s) {

        int ans = 0;
        int hasOdd = 0;
        Map<Character, Integer> hm = new HashMap<>();

        for(char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        for(int i: hm.values()) {
            if (i % 2 == 0) {
                ans+= i;
            } else {
                ans+= (i-1);
                hasOdd = 1;
            }
        }

        return ans + hasOdd;
    }
}