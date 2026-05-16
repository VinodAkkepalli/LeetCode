class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int i = 0;
        int strsLen = strs.length;

        if(strs.length == 1) {
            return strs[0];
        }

        String ss = Arrays.stream(strs).reduce((s1, s2) -> s1.length() < s2.length() ? s1 : s2).orElse("");


        while ( i < ss.length()) {

            for ( String str : strs) {
                if (ss.charAt(i) != str.charAt(i)) {
                    return ss.substring(0, i);
                }
            }
            i++;
        }
        return ss.substring(0, i);
    }
}