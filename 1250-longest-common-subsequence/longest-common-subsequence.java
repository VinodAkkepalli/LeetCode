class Solution {

    //Declare a static matrix for memoization
    static int[][] dp;
    
    public int longestCommonSubsequence(String text1, String text2) {

        //define the length of rows and columns
        dp = new int[text1.length()+1][text2.length()+1];
        //fill the matrix with -1 to identify unvisited
        Arrays.stream(dp).forEach(i->Arrays.fill(i, -1));

        return lcs(text1, text2, text1.length(), text2.length());
        
    }



    public static int lcs(String text1, String text2,int m,int n) {
        if (m == 0 || n == 0) {
            dp[m][n] = 0;
            return dp[m][n];
        }
        
        // if already visited and value calculated, return the value
        if(dp[m][n] != -1) {
            return dp[m][n];
        }

        if(text1.charAt(m-1) == text2.charAt(n-1)) {
            return dp[m][n] = 1 + lcs(text1, text2, m-1, n-1);
        } else {
            return dp[m][n] = Math.max(
                lcs(text1, text2, m-1, n),
                lcs(text1, text2, m, n-1)
            );
        }
    }
}