class Solution {
    public int maxOperations(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for(int i : nums) {
            if(hm.containsKey(k-i)) {
                ans++;
                if(hm.get(k-i) == 1) {
                    hm.remove(k-i);
                 } else {
                    hm.put(k-i, hm.get(k-i)-1);
                 } 
            } else {
                hm.put(i, hm.getOrDefault(i, 0)+1);
            }
        }
        return ans;
    }
}