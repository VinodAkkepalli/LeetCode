class Solution {
    public String removeStars(String s) {

        int i = 0;
        char c;
        Stack<Character> stack = new Stack<>();

        while(i < s.length()) {
            c = s.charAt(i);
            if(c == '*'){
                stack.pop();
            } else {
                stack.push(c);
            }
            
            i++;
        }

        String ans = "";
        while(!stack.isEmpty()) {
            ans = String.valueOf(stack.pop()) + ans;
        }
        
        return ans;
    }
}