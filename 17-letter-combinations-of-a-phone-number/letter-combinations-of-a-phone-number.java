class Solution {

    String[] lettersArr = new String[] {"", "","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        list.add("");

        for(char c : digits.toCharArray()) {
            myMethod(lettersArr[c - '0']);
        }

        return list;        
    }

    public void myMethod(String letters) {

        List<String> tempList = new ArrayList<>();
        for(String str: list) {
            
            for(char c: letters.toCharArray()) {
                tempList.add(str+c);
            }
        }
        
        list = tempList;
    }
}