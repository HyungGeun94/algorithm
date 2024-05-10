class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuffer sb= new StringBuffer();
        
        for(String str : str_list){
            if(str.contains(ex)){
                
            }else{
                sb.append(str);
            }
        }
        
        return sb.toString();
    }
}