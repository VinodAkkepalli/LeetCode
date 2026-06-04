class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hm = new HashMap<>();

        Map<Character, Long> frequency = s.chars()
                                        .mapToObj(c -> (char) c)
                                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        for (char c : t.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0L) - 1);
        }

        Optional<Long> any = frequency.values().stream().filter(i -> i != 0).findAny();
        
        return any.isEmpty();
        
    }
}