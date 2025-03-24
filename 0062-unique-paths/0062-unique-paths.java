class Solution {
    public int uniquePaths(int m, int n) {
        return combination(m + n - 2, m - 1);
    }

    // Function to compute C(n, r) = n! / (r! * (n-r)!)
    private int combination(int n, int r) {
        long result = 1; // Use long to avoid overflow
        r = Math.min(r, n - r); // Optimization: C(n, r) == C(n, n-r)
        
        // Compute (n! / (r! * (n-r)!)) in a memory-efficient way
        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }
        
        return (int) result; // Convert back to int (safe because result <= 2 * 10^9)
    }
}