class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();
        list.add(newInterval);
        for(int[] interval:intervals){
            list.add(interval);
        }
        int[][] newarray = list.toArray(new int[list.size()][]);
        Arrays.sort(newarray, new Comparator<int[]>(){
            public int compare(int[]a, int[]b){
                return a[0]-b[0];
            }
        });
        List<int[]> result = new ArrayList<>();
        int[] firstinterval = newarray[0];
        result.add(firstinterval);
        for(int[] interval:newarray){
            if(interval[0]<=firstinterval[1]){
                // when joint is there
                firstinterval[1] = (Math.max(interval[1],firstinterval[1]));
            }
            else{
                //disjointed is there
                firstinterval = interval;        
                result.add(firstinterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
