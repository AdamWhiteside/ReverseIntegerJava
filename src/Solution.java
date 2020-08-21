class Solution {
    public int reverse(int x) {

        Long rev;
        if(x >= 0){
            rev = Long.parseLong(new StringBuilder(Integer.toString(x)).reverse().toString());
        }else{
            rev = -1 * Long.parseLong(new StringBuilder(Integer.toString(x).substring(1)).reverse().toString());
        }

        if(Math.abs(rev) >= Integer.MAX_VALUE){
            return 0;
        } else {
            return rev.intValue();
        }
    }
}