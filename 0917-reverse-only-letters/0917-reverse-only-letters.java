class Solution {
    public String reverseOnlyLetters(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        char[] arr = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetter(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetter(s.charAt(right))) {
                right--;
            }
            if (left < right) {
                char tmp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = tmp;
            }
        }
        return new String(arr);
    }
}