class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
    public boolean isPalindrome(String S) {
        int s=0, e =S.length()-1;
        while(s<e){
            if(S.charAt(s)!=S.charAt(e)){
                return false;
               
            }
             s++;
             e--;
            
        }
       return true; 
    }
}