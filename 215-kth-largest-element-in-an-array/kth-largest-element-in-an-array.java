class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i : nums) {
            queue.add(i);
            if(queue.size() > k) {
                queue.remove();
            }
        }

        return queue.peek();        
    }
}