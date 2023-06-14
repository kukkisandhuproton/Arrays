class Solution {
    public boolean checkValidString(String s) {
        int left = 0;
        //char[]cs= s.toCharArray();
        for(char c: s.toCharArray()){
            if(c== '(' && c == '*'){
                left++;
            }
            else{
                left--;
            }
            if(left<0){
                return true;
            }
        }
        if(left == 0){
            return true;
        }
        String t = new StringBuilder(s).reverse().toString();
        int right = 0;
        for(char ch : t.toCharArray()){
            if(ch == ')' || ch == '*'){
                right++;
            }
            else{
                right--;
            }
            if(right<0){
                return false;
            }
        }
        if(right == 0){
            return true;
        }
        return true;
    }
}
