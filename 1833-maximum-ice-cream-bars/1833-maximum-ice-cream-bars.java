class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int len = costs.length;
        int i = 0;
        while (i < len && costs[i] <= coins) {
            coins -= costs[i];
            i++;
        }
        return i;
    }
}