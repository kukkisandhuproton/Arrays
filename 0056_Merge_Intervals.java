class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[]a, int[]b){
                return a[0]-b[0];
            }
        });
        
        List<int[]>list = new ArrayList<>();
        int[] newinterval = intervals[0];
        list.add(newinterval);
        
        for(int[]interval:intervals){
            if(newinterval[1]>=interval[0]){
                newinterval[1]=Math.max(newinterval[1],interval[1]);
            }
            else{
                newinterval = interval;
                list.add(newinterval);
            }
        }



        return list.toArray(new int[list.size()][]);
    }
}
