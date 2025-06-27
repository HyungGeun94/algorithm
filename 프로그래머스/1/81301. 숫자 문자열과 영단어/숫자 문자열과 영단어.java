class Solution {
    public int solution(String s) {
        String answer = "";
        
        String[] strArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i=0; i<s.length(); i++){
            
            String strSub = s.substring(i);
            System.out.println(strSub);
            for(int j=0; j<strArr.length; j++){
                
                    if(strSub.startsWith(strArr[j])){
                        answer+=j;
                        break;
                    }else if(strSub.charAt(0)>='0' && strSub.charAt(0)<='9'){
                        answer+=strSub.charAt(0);
                        break;
                    }
                }
            
            
        }
        // return 0;
        return Integer.parseInt(answer);
    }
}