class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        
        String str1 = my_string.charAt(num1)+"";
        String str2 = my_string.charAt(num2)+"";
        
        sb.replace(num1,num1+1,str2);
        sb.replace(num2,num2+1,str1);
        
        
        
        return sb.toString();
    }
}