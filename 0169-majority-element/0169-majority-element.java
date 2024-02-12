class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;

        for (int i : nums) {
            hash.put(i, 1 + hash.getOrDefault(i, 0));
            if (hash.get(i) > majority) {
                res = i;
                majority = hash.get(i);
            }
        }

        return res;        
    }
}