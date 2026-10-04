class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> num1Set = new HashSet<>();
        for(int i : nums1) {
            num1Set.add(i);
        }

        Set<Integer> num2Set = new HashSet<>();
        for(int i : nums2) {
            num2Set.add(i);
        }

        Set<Integer> difference1 = new HashSet<>(num1Set);
        difference1.removeAll(num2Set);

        Set<Integer> difference2 = new HashSet<>(num2Set);
        difference2.removeAll(num1Set);

        List<Integer> list1 = List.copyOf(difference1);
        List<Integer> list2 = List.copyOf(difference2);
        

        return List.of(list1, list2);
        
    }
}