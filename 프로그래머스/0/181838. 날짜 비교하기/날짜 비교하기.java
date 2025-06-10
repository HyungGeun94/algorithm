class Solution {
    public int solution(int[] date1, int[] date2) {
        
        String str1 = date1[0]+""+date1[1]+date1[2];
        String str2 = date2[0]+""+date2[1]+date2[2];
        
        return Integer.parseInt(str1) < Integer.parseInt(str2) ? 1:0;
    }
}