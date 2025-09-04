class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int windowSum = 0, total = 0, minSum = 0;
       int windowSize = cardPoints.length - k;
       for(int card : cardPoints) total += card;
       
       for(int i = 0; i < windowSize; i++) windowSum += cardPoints[i];
       minSum = windowSum;

       for(int i = windowSize; i < cardPoints.length; i++){
        windowSum += cardPoints[i] - cardPoints[i - windowSize];
        minSum = Math.min(minSum, windowSum);
       }
       return total - minSum;
    }
}