class Solution {
    public int solution(String my_string) {
        
        
        String[] split = my_string.split(" ");
        
        int sum=Integer.parseInt(split[0]);
        
        boolean yang = true;
        
        
        for(int i=1; i<split.length; i++){
            
            if(i%2==0){
                
                sum += yang ? Integer.parseInt(split[i]) : -Integer.parseInt(split[i]);
                
                
                
            }else{
                yang = split[i].equals("+") ? true : false;
                
                
            }
            
            
            
        }
        
        return sum;
            
        }
        
        
}