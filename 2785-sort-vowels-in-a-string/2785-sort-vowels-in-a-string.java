class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder("");
        ArrayList<Character> vovels = new ArrayList<>();
        int len = s.length();

        for(int i=0; i<len ; i++){
            char ch = s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
                ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vovels.add(ch);
            }
        }

        Collections.sort(vovels);
        int idx=0;
        for(int i=0; i<len; i++){
            char ch = s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || 
                ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                sb.append(vovels.get(idx++));
            } else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}