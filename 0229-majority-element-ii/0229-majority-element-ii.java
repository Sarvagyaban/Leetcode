class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {   
        HashMap<Integer, Integer> hash = new HashMap<>();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for (int i : nums) {
            hash.put(i, 1 + hash.getOrDefault(i, 0));
        }
        
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            if (count > (nums.length/3)) {
                arr1.add(element);
            }
        }
        
        

        return arr1;       
        
    }
}