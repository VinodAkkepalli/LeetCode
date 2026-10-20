class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        
        dp = new int[word1.length()+1][word2.length()+1];
        Arrays.stream(dp).forEach(i -> Arrays.fill(i, -1));
        return minDistanceTD(word1, word2, word1.length(), word2.length());
    }

    int minDistanceTD(String word1, String word2, int len1, int len2) {
        if(len1 == 0) {
            return dp[len1][len2] = len2;
        }
        if(len2==0) {
            return dp[len1][len2] = len1;
        }

        if(dp[len1][len2] != -1) {
            return dp[len1][len2];
        }

        if(word1.charAt(len1-1) == word2.charAt(len2-1)) {
            return dp[len1][len2] = minDistanceTD(word1, word2, len1-1, len2-1);
        }

        return dp[len1][len2] = 1 + Math.min(minDistanceTD(word1, word2, len1-1, len2),
                                Math.min(minDistanceTD(word1, word2, len1, len2-1),
                                minDistanceTD(word1, word2, len1-1, len2-1)));
    }
}