class Solution {
    public int numberOfWays(String corridor) {
        return noCorridor(corridor);
    }
    
    public static int noCorridor(String s) {
        int totalseats = 0;
        int seat = 0;
        int plant = 0;
        int mod = (int) ((1e9) + 7);
        boolean firstCorridor = false;
        long ans = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='S') {
                totalseats++;
                seat++;
            }
            else if(seat == 0) {
                plant++;
            }
            if(seat == 2) {
                if(firstCorridor) {
                    ans = ans * (plant+1);
                    ans %= mod;
                }
                firstCorridor = true;
                seat = 0;
                plant = 0;
            }
        }
        if(totalseats == 0 || (totalseats & 1) != 0) return 0;
        return (int)ans;
    }
}