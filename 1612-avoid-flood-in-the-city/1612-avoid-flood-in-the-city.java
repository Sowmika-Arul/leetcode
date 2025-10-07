
class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> full = new HashMap<>(); 
        TreeSet<Integer> dryDays = new TreeSet<>();   

        for (int i = 0; i < n; i++) {
            int lake = rains[i];
            if (lake == 0) {
                dryDays.add(i);
                ans[i] = 1; 
            } else {
                ans[i] = -1; 
                if (full.containsKey(lake)) {
                    int lastRainDay = full.get(lake);
                    Integer dryDay = dryDays.higher(lastRainDay); 
                    if (dryDay == null) {
                        return new int[0]; 
                    }
                    ans[dryDay] = lake; 
                    dryDays.remove(dryDay); 
                }
                full.put(lake, i); 
            }
        }
        return ans;
    }
}
