class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        
        String buho = ineq+eq;
        
        if(buho.equals(">=")){
            
            return n >= m ? 1 : 0;
            
        }else if(buho.equals(">!")){
            
                        return n > m ? 1 : 0;

        }else if(buho.equals("<=")){
                        return n <= m ? 1 : 0;

        }else{
                        return n < m ? 1 : 0;

        }
        
        
    }
}