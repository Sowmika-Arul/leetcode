import java.util.ArrayList;
import java.util.List;

class Solution {
    public int compress(char[] chars) {
        int index = 0; 
        int i = 0;      
        
        while (i < chars.length) {
            char currentChar = chars[i];  
            int count = 0;  
            
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++; 
            }
            
            chars[index++] = currentChar;
            
            if (count > 1) {
                for (char j : Integer.toString(count).toCharArray()) {
                    chars[index++] = j;  
                }
            }
        }

        return index;
    }
}
