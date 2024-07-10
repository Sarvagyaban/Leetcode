class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for (String log : logs) {
            if (!log.equals("./") && !log.equals("../")) {
                count++;
            } else if (count > 0 && log.equals("../")) {
                count--;
            }
        }
        return count;
    }
}