class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String info : details) {
            char age = info.charAt(11);
            char age1 = info.charAt(12);
            if (age > '6' || (age == '6' && age1 > '0')) {
                count++;
            }
        }
        return count;
    }
}
