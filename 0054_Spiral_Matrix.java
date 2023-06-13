class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int right = column-1, left = 0, top = 0, bottom =row-1;
        List<Integer> ans = new ArrayList<>();

        while(bottom>=top && right>=left){
            //move from left to right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            // move from top to bottom
            for (int i = top; i <= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            //move from right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //move from bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
    return ans;
    }
}
