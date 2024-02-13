class Solution {
    public int mostFrequentEven(int[] nums) {
        int res=Integer.MAX_VALUE;
        int count=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            if(i%2==0){
                map.put(i,map.getOrDefault(i,0)+1);
                if(count<map.get(i)){
                    count=map.get(i);
                    res=i;
                }else if(count==map.get(i)){
                    res=Math.min(res,i);
                }
            }
        }
         if(map.isEmpty()) return -1; 
        return res; 
    }
}