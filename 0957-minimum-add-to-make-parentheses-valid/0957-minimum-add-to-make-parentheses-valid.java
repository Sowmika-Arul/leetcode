class Solution {
    public int minAddToMakeValid(String s) {
       int opencount = 0;
       int closecount = 0;
       for(int i = 0; i < s.length(); i++)
       {
        char ch = s.charAt(i);
        if(ch == '(')
        opencount++;
        else if(ch == ')')
        {
            if(opencount > 0)
            opencount--;
            else
            closecount++;
        }
       }
       return opencount+closecount;
    }
}