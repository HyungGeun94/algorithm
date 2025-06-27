class Solution {
    public String solution(String s) {
        
        s= s.toLowerCase();
        
        int idx=0;
        String answer ="";
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            
            if(ch==' '){
                idx=0;
                answer+=' ';
            }else if(idx %2==0){
                System.out.println(ch);
                answer+=Character.toUpperCase(ch);
                idx++;
                
            }else{
                answer+=ch;
                idx++;
            }
            
        }
        
        
        return answer;
    }
}