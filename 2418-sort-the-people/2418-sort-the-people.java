class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        int numOfPeople = names.length;

        Map<Integer, String> heightToNameMap = new HashMap<>();

        for(int i = 0; i < numOfPeople; i++) {
            heightToNameMap.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        int c=0;
        String sortedNames[] = new String[numOfPeople];

        for(int i = numOfPeople - 1; i >= 0; i--) {
            sortedNames[c++] = heightToNameMap.get(heights[i]);
        }
        return sortedNames;
    }
}