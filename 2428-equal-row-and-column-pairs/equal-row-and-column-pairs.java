class Solution {
    public static int equalPairs(int[][] grid) {

        int ans = 0;

        Map<String, Integer> rowMap = new HashMap<>();
        String tempString;
        int rowLen = grid[0].length;

        for(int[] row: grid) {
            tempString = Arrays.toString(row);
            rowMap.put(tempString, rowMap.getOrDefault(tempString, 0)+1);
        }

        for(int i=0; i <rowLen; i++ ) {
            tempString = "";
            int[] colArr = new int[rowLen];

            for (int j = 0; j < rowLen; j++) {
                colArr[j] = grid[j][i];                
            }
            tempString = Arrays.toString(colArr);                

            ans += rowMap.getOrDefault(tempString,0);
        }

        return ans;
    }
}