class Solution {
    public String minWindow(String s, String t) {
        if (t.length() == 0) {
            return "";
        }

        // Frequency map for characters in t
        Map<Character, Integer> mpt = new HashMap<>();
        Map<Character, Integer> mps = new HashMap<>();

        for (char c : t.toCharArray()) {
            mpt.put(c, mpt.getOrDefault(c, 0) + 1);
        }

        int cur = 0, total = mpt.size();
        int i = 0, j = 0;
        int res = Integer.MAX_VALUE;
        int start = 0, end = 0;

        while (j < s.length()) {
            char c = s.charAt(j);
            if (mpt.containsKey(c)) {
                mps.put(c, mps.getOrDefault(c, 0) + 1);
                if (mps.get(c).equals(mpt.get(c))) {
                    cur++;
                }
            }

            // Shrink the window while it is valid
            while (cur == total) {
                // Update result if a smaller window is found
                if (j - i + 1 < res) {
                    res = j - i + 1;
                    start = i;
                    end = j;
                }

                // Remove the character at position i from the window
                char leftChar = s.charAt(i);
                if (mps.containsKey(leftChar)) {
                    mps.put(leftChar, mps.get(leftChar) - 1);
                    if (mps.get(leftChar) < mpt.get(leftChar)) {
                        cur--;
                    }
                }
                i++;
            }

            // Expand the window
            j++;
        }

        return res == Integer.MAX_VALUE ? "" : s.substring(start, end + 1);
    }
}