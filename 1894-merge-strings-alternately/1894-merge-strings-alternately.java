class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        StringBuilder store = new StringBuilder();
        int count = 0;

        for(int i = 0, j = 0; i < length1 && j < length2; i++, j++){
            count++;
            store.append(word1.charAt(i));
            store.append(word2.charAt(j));
        }

        if(count != length1){
            for(int i = count; i < length1; i++) store.append(word1.charAt(i));
        }

        else {for(int i = count; i < length2; i++) store.append(word2.charAt(i));}

        return store.toString();
    }
}