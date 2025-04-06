class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> mergedList = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedList.add(currentInterval);
        for (int i = 1; i < intervals.length; i++) {
            int currentEnd = currentInterval[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (currentEnd >= nextStart) {

                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {

                currentInterval = intervals[i];
                mergedList.add(currentInterval);
            }
        }

        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
