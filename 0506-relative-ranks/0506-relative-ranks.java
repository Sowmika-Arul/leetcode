class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] store = new String[score.length];
        int[][] twoDimension = new int[score.length][2];

        for(int i = 0; i < score.length; i++){
            twoDimension[i][0] = score[i];
            twoDimension[i][1] = i;
        }
        
        Arrays.sort(twoDimension, (a,b)-> b[0] - a[0]);

        for(int i = 0; i < score.length; i++){
            int index = twoDimension[i][1];

            if(i == 0) store[index] = "Gold Medal";
            else if(i == 1) store[index] = "Silver Medal";
            else if(i == 2) store[index] = "Bronze Medal";
            else store[index] = String.valueOf(i + 1);
        }
        return store;
    }
}