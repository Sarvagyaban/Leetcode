class Solution {
    public static String reverseEveryStringInArray(String[] str){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length; i++){
            result.append(new StringBuilder(str[i]).reverse());
            if(i != str.length-1){
                result.append(" ");
            }
        }
        return result.toString();
    }

    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        return reverseEveryStringInArray(arr);
    }
}