import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        
     
        return Long.parseLong(String.valueOf(n)                   
          .chars()                         
          .mapToObj(c -> (char)c)          
          .sorted((a, b) -> b - a)       
          .map(ch -> String.valueOf(ch))           
          .collect(Collectors.joining())  
        );
    }
}