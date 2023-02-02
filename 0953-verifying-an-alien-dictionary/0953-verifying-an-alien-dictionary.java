class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int arr[]=new int[26];
        for(int i=0;i<order.length();i++){
            arr[order.charAt(i)-97]=i;
        }
        for(int i=0;i<words.length-1;i++){
            int j=0;
            int f=0;
            while(j<words[i].length()&&j<words[i+1].length()){
                if(arr[words[i].charAt(j)-97]<arr[words[i+1].charAt(j)-97]){
                    f=1;
                    break;
                }
                else if(arr[words[i].charAt(j)-97]==arr[words[i+1].charAt(j)-97]){
                    j++;
                    continue;
                }
                else{
                    return false;
                }
            }
            if(f==0){
                if(words[i].length()>words[i+1].length()){
                    return false;
                }
            }
        }
        return true;
    }
}