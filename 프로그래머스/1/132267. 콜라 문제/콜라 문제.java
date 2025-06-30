class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        int sum = 0;
        int cola = 0;
        int bincola =n;
        
        
        while(bincola>=a){
            
            cola = (bincola/a) *b;
            sum +=cola;
            bincola = bincola%a +cola;
            
        }
        
        return sum;
    }
}