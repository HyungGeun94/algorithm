import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        String str = "";
        
        
        List<String> list = new ArrayList<>();
        
        
        for(int i =0; i<myStr.length(); i++){
            
            if(myStr.charAt(i)=='a' || myStr.charAt(i)=='b' || myStr.charAt(i)=='c' ){
                if(!str.equals(""))
                list.add(str);
                str="";
                
                
            }
            else{
                str+=myStr.charAt(i);
                
                
            }        
        }
                if(!str.equals(""))
                list.add(str);
                if(str.isEmpty()){
                    return new String[]{"EMPTY"};
                }
        
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
            
        }
        

        
        
        return answer;
    }
}