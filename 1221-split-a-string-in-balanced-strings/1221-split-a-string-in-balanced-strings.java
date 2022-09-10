class Solution {
    public int balancedStringSplit(String s) {
        char [] ch=s.toCharArray();
int ans=0, bal=0;
for (int i=0;i<ch.length;i++)
{
if(ch[i]=='L')
bal++;
else 
bal--;
if(bal==0) ans++;
}
   return ans;     
    }
}