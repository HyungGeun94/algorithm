class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String str1="";
        int cnt1=0;
        String str2="";
        int cnt2=0;
        
        
        for(int i=0; i<s.length();i++){
            
            if(str1.equals("")){
            str1 += s.charAt(i);
                cnt1++;
            }else if(str1.equals(s.charAt(i)+"")){
                cnt1++;
            }else{
                cnt2++;
            }
            
            if(cnt1==cnt2){
                answer++;
                str1="";
                str2="";
                cnt1=0;
                cnt2=0;
            }
            
            if(i==s.length()-1 && str1.length()!=0){
                answer++;
            }
            
            
        }
        
        
        return answer;
    }
}