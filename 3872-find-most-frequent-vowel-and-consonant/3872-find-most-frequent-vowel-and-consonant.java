class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowels = new HashMap<>();
        HashMap<Character, Integer> consonants = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) 
            vowels.put(s.charAt(i), vowels.getOrDefault(s.charAt(i),0)+1);
            else
            consonants.put(s.charAt(i), consonants.getOrDefault(s.charAt(i),0)+1);
        }

       int vowelMax = 0;
       int consonantMax = 0;
        for(Map.Entry<Character, Integer> entry : vowels.entrySet()){
            if(entry.getValue() > vowelMax) vowelMax = entry.getValue();
        }

        for(Map.Entry<Character, Integer> entry : consonants.entrySet()){
            if(entry.getValue() > consonantMax) consonantMax = entry.getValue();
        }
        return vowelMax + consonantMax;
    }

    private boolean isVowel(char c){
      return "AEIOUaeiou".indexOf(c) != -1;
    }
}