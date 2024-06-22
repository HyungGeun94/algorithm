class Solution {
    public String solution(String my_string, int[][] queries) {
        
        for(int i=0; i<queries.length; i++){
            
            String str ="";
            str += my_string.substring(0,queries[i][0]);
            str += (new StringBuffer(my_string.substring(queries[i][0],queries[i][1]+1)).reverse()).toString();
            str += my_string.substring(queries[i][1]+1);
            
            my_string=str;
            
        }
        
        
        return my_string;
    }
}