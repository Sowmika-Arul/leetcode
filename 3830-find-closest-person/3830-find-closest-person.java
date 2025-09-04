class Solution {
    public int findClosest(int x, int y, int z) {
        int min1 = Math.abs(x - z);
        int min2 = Math.abs(y - z);
        if(min1 < min2) return 1;
        else if(min1 == min2) return 0;
        else return 2;
    }
}