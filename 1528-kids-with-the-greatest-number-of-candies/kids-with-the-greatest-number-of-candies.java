class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Arrays.stream(candies).max().getAsInt();

        List<Boolean> result = new ArrayList<>();

        for(int i: candies) {
            result.add(extraCandies+i >= max ? true : false);
        }
        
        return result;
    }
}