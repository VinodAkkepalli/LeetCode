class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;
        if(s.equals(goal)) return true;

        for(int i = s.length()-1; i > 0; i--) {
            if(s.contains(goal.substring(0, i)) && s.indexOf(goal.substring(i)) == 0) return true;
        }

        return false;        
    }
}