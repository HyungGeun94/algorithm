class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int pLen = p.length();
        long pValue = Long.parseLong(p);

        for (int i = 0; i <= t.length() - pLen; i++) {
            String subStr = t.substring(i, i + pLen); 
            long subStrValue = Long.parseLong(subStr);

            if (subStrValue <= pValue) {
                count++;
            }
        }

        return count;
    }
}
