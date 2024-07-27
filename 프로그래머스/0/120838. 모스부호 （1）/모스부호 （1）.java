class Solution {
    public String solution(String letter) {
        
        StringBuffer sb = new StringBuffer();
        

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String str[] = letter.split(" ");
        
        for(int i=0; i<str.length; i++){
            
            for(int j=0; j<morse.length; j++){
            
                if(str[i].equals(morse[j])){
                
                    sb.append((char)('a'+j));
                
                }
               
               }
            
            
        }
        
        return sb.toString();
    }
}