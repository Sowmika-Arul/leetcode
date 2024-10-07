class Solution {
    public int minLength(String s) {
      Stack<Character> n = new Stack<>();
    for(int i = 0; i < s.length(); i++)
    {
        char cur = s.charAt(i);
        if(n.isEmpty())
        {
            n.push(cur);
            continue;
        }
        if(cur == 'B' && n.peek() == 'A')
        n.pop();
        else if(cur == 'D' && n.peek() == 'C')
        n.pop();
        else
        n.push(cur);
    }
    return n.size();
    }

}