class Solution {
    public String[] solution(String[] picture, int k) {
        
        String[] answer = new String[picture.length *k ];

        String tmp ="";
        String[] tmpArr =new String[picture.length];
        
        for(int i=0; i<picture.length; i++){
            for(int j=0; j<picture[i].length(); j++){
                for(int l=0; l<k; l++){
                tmp+=picture[i].charAt(j);
                }
            }
            tmpArr[i]=tmp;
            tmp="";
        }
        
        int t=0;
        for(int i=0; i<tmpArr.length; i++)
            for(int j=0; j<k; j++){
                answer[t++]=tmpArr[i];
                
            }
        
        


        
        
        
        return answer;
    }
}