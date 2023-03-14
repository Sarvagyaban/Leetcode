class Solution {
    public boolean isAnagram(String s, String t) 
    {
     if(s.length()!=t.length())
     {return false;}
        else
        {
        char tempArray[] = s.toCharArray();
        char tempArray1[] =t.toCharArray();
            Arrays.sort(tempArray);
            Arrays.sort(tempArray1);
            for(int i=0;i<s.length();i++)
            {
                if(tempArray[i]!=tempArray1[i])
                    return false;
            }
            return true;

        }
    }
}