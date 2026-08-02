class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String str : strs ) {
            int[] charCount = new int[26];
            for(char c : str.toCharArray()){
                charCount[c - 'a']++;
            }

            String countString = Arrays.toString(charCount);

            anagramMap.putIfAbsent(countString, new ArrayList<>());
            anagramMap.get(countString).add(str);
        }


        return new ArrayList<>(anagramMap.values());
    }
}