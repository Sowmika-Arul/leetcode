class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int max = 0;

        // Sorting in descending order based on units per box
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);  

        for (int i = 0; i < boxTypes.length; i++) {
            if (truckSize >= boxTypes[i][0]) {  // If truck can take all boxes
                max += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            } else {  // If truck can take only partial boxes
                max += truckSize * boxTypes[i][1];
                break;  // Truck is full, so stop processing
            }
        }

        return max;
    }
}