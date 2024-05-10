class Solution {
    public int solution(int n, String control) {
        char[] c = control.toCharArray();
        
        for(char cha : c){
            if(cha=='w'){
                n+=1;
                
            }else if(cha == 's'){
                
                n-=1;
            }else if(cha == 'd'){
                n+=10;
            }else{
                n-=10;   
            }
            
        }
        
        return n;
    }
}