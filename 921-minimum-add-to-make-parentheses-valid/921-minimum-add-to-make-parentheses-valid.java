class Solution {
    public int minAddToMakeValid(String S) {
        int count = 0;
        int ans = 0;
        for(int i = 0; i <S.length(); i++) {
            count = (S.charAt(i) == ')') ? count-1 : count+1;
            if(count==-1) {
                ans++;
                count=0;
            }
        }
        
        return ans + count;
    }
}