class Solution {
    public String sortVowels(String s) {
        int vowelIndex = 0;
        List<Character> vowel = new ArrayList<>();
        StringBuilder result = new StringBuilder();

       for(char c : s.toCharArray()) { if(isVowel(c)) vowel.add(c); }

       Collections.sort(vowel);

       for(char c : s.toCharArray()) {
        if(isVowel(c)) result.append(vowel.get(vowelIndex++));
        else result.append(c);
       }

        return result.toString();
    }

    private boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}