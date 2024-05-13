class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String storage = "";
        
        for(int i=0; i<my_string.length() ; i++){
            System.out.println(storage);
            
            if(storage.length()==4){
                 answer += Integer.parseInt(storage);
                storage="";
            }
            
            if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9'){
                
                storage= storage +( (my_string.charAt(i)-'0'));
                
                if (i == my_string.length() - 1) {
                    answer += Integer.parseInt(storage);
                }
            }
            
            else if(storage.length()!=0){
                answer += Integer.parseInt(storage);
                storage="";
            }
            
     
            
        }
        
        
        
        return answer;
    }
}