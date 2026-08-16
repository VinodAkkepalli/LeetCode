class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] ans = new int[temperatures.length];
        Stack<Integer> bottomBigStack = new Stack<>();

        for(int i = temperatures.length-1; i > -1; i--) {
            while(i > -1 && !bottomBigStack.isEmpty() && temperatures[i] >= temperatures[bottomBigStack.peek()] ) {
                bottomBigStack.pop();
            }

            if(bottomBigStack.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = bottomBigStack.peek() - i;
            }
            bottomBigStack.push(i);
        }

        return ans;
    }
}