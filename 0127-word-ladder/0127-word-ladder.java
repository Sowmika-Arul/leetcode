class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
       Set<String> s = new HashSet<>();
       Queue<String> q = new LinkedList<>();
       int flag = 0, level = 0;
       for(String ne : wordList)
       {
        if(ne.compareTo(endWord)== 0) 
        flag = 1;
        s.add(ne);
       }
       if(flag == 0) return 0;
    q.add(beginWord);
   while(!q.isEmpty())
    {
        level++;
        int lsize = q.size();
        while(lsize > 0)
        {
            String word = q.poll();
        for(int i = 0; i < word.length(); i++)
        {
        StringBuilder wor = new StringBuilder(word);
        for(char ch = 'a'; ch <= 'z'; ch++)
        {
            wor.setCharAt(i,ch);
            String temp1 = wor.toString();
            if(temp1.compareTo(word) == 0) continue;
            if(temp1.compareTo(endWord) == 0) 
            return level+1;
            if(s.contains(temp1))
            {
                q.add(temp1);
                s.remove(temp1);
            }
        }
        }
        lsize--;
        }
    }
        return 0;
    }
}