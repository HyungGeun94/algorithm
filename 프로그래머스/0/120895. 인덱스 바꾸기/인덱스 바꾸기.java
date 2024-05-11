class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuffer sb = new StringBuffer(my_string);
        
        sb.deleteCharAt(num1);
        sb.insert(num1,my_string.charAt(num2));
        
        sb.deleteCharAt(num2);
        sb.insert(num2,my_string.charAt(num1));
        
        return sb.toString();
    }
}