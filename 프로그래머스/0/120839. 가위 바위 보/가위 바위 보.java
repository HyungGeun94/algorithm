class Solution {
    public String solution(String rsp) {
        
        StringBuffer sb = new StringBuffer();
        
        char[] chArr = rsp.toCharArray();
        
        for(int i=0; i<chArr.length; i++){
            
            if(chArr[i]=='2'){
                sb.append(0);
            }else if(chArr[i]=='0'){
                sb.append(5);
            }else{
                sb.append(2);
            }
            
        }
        
        
        
        return sb.toString();
    }
}