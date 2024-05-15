class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] split = letter.split(" ");

        String[] moss = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] mossAlpa = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",};
        
        for(String part : split){
            for(int i=0; i<moss.length; i++){
                if(part.equals(moss[i])){
                    answer+=mossAlpa[i];
                    
                }
                
                
            }
        }
        
        
        
            
               
        
        return answer;
    }
}