class Solution {

    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();

        int[] prev = new int[n + 1];
        int[] cur = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    cur[j] = 1 + prev[j - 1];
                } else {
                    cur[j] = Math.max(prev[j], cur[j - 1]);
                }
            }

            // Copy current row to previous row
            System.arraycopy(cur, 0, prev, 0, n + 1);
        }

        return prev[n];
    }
}
