class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        int total = 0;
        int prev = 0;
        int curr = 0;

        for(int i=0; i < s.length(); i++) {
            curr = hm.get(s.charAt(i));
            if(prev < curr) {
                total += (curr - (2 * prev));
            } else {
                total += curr;
            }
            prev = curr;
        }
        return total;
    }
}