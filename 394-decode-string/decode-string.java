class Solution {
    public String decodeString(String s) {

        Stack<String> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            //Push to stack until ]
            if(s.charAt(i) != ']') {
                stack.push(s.charAt(i)+"");
            } else {

                String tempStr = "";

                //pop from stack and form temp string until [
                while(!stack.peek().equals("[")) {
                    tempStr = stack.pop() + tempStr;
                }

                //get integer from stack pop
                stack.pop();
                StringBuilder ts = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    ts.insert(0, stack.pop());
                }
                int num = Integer.parseInt(ts.toString());
                
                // construct temp string with repetitions
                StringBuilder repeatedStr = new StringBuilder();
                for(int j = 0; j < num; j++) {
                    repeatedStr.append(tempStr);
                }

                // push the decoded string back to stack
                stack.push(repeatedStr.toString());
            }
        }

        StringBuilder ans = new StringBuilder();


        while(!stack.isEmpty()) {
            ans = new StringBuilder(stack.pop()).append(ans);
        }
        
        return ans.toString();
    }
}