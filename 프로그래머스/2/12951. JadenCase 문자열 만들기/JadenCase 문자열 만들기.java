class Solution {
    public String solution(String s) {
        String str = s.toLowerCase();
        
        String answer ="";
        
        boolean check = true;
        
        for(int i=0; i<str.length(); i++){
            
            
            if(str.charAt(i)>='a' && str.charAt(i)<='z' && check){
                
                answer+= (str.charAt(i)+"").toUpperCase();
                check=false;
            }
            else if(str.charAt(i)==' '){
                answer+= str.charAt(i);
                check=true;
            }else{
                answer+=str.charAt(i);
                check=false;
            }
            
        }
        
        
        
        return answer;
    }
}