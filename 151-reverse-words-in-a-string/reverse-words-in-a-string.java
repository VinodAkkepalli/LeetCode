class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        int i = 0;
        StringBuilder output =  new StringBuilder();
        StringBuilder temp = new StringBuilder();

        while(i < s.length()) {

            if(s.charAt(i) == ' ') {
                if(s.charAt(i-1) != ' ') {
                    output = temp.append(" ").append(output);
                    temp = new StringBuilder("");
                }
            } else {
                if(temp == null) {
                    temp = new StringBuilder(s.charAt(i));
                } else {
                    temp = temp.append(s.charAt(i));
                }
            }
            i++;
        }

        return temp.append(" ").append(output).toString().trim();
    }
}