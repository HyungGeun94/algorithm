class Solution {
    public int solution(String s) {

        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
       
        StringBuffer answerSb = new StringBuffer();
        
        StringBuffer sentenceSb= new StringBuffer();
        
        
        int size = s.length();
        for(int i=0; i<size;i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                
                sentenceSb.append(s.charAt(i));
                
                for(int j=0; j<str.length; j++){
                    
                    if((sentenceSb.toString().equals(str[j]))){
                        
                        answerSb.append(j);
                        sentenceSb= new StringBuffer();
                    }
                }
                
            }else{
                answerSb.append(ch);
            }
        }
        
        return Integer.parseInt(answerSb.toString());
    }
}