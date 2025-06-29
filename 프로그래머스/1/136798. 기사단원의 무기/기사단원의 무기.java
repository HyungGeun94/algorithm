class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int yaksu =0;
        
        for(int i=1; i<=number; i++){
            
            
            
            
            for(int j=1; j<=(int)Math.sqrt(i); j++){

                if(i%j==0){
                    if(j*j==i){
                     yaksu+=1;
                    }else{
                        yaksu+=2;
                    }
                }
                
                
            }
            
            System.out.println(yaksu);
            
            
            
            if(yaksu>limit){
                answer+=power;
            }else{
                answer+=yaksu;
            }
            
            yaksu=0;
            
        }
        
        return answer;
    }
}