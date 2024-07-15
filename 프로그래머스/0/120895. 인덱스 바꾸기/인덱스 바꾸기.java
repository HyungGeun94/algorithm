class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        
        StringBuffer sb = new StringBuffer();
        
        String strNum1 = my_string.charAt(num1)+"";
        String strNum2 = my_string.charAt(num2)+"";
        
        for(int i=0; i<my_string.length(); i++){
            
            if(i!=num1 && i!=num2)
            sb.append(my_string.charAt(i));
            else if(i==num1)
            sb.append(strNum2);
            else if(i==num2)
            sb.append(strNum1);
        }
        
        
        
        return sb.toString();
    }
}