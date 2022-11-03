class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i-j==-1||i+j==s.length()){
                    break;
                }
                else{
                    if(s.charAt(i-j)==s.charAt(i+j)){
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        for(double i=0.5;i<s.length();i++){
            for(double j=0.5;j<s.length();j++){
                if((int)(i-j)==-1||(int)(i+j)==s.length()){
                    break;
                }
                else{
                    if(s.charAt((int)(i-j))==s.charAt((int)(i+j))){
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return count;
    }
}