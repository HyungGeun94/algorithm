class Solution {
    public int solution(String myString, String pat) {
        
        myString = myString.replace("A","c");
        myString = myString.replace("B","A");
        myString = myString.replace("c","B");
        
        
        return myString.contains(pat) ? 1 : 0 ;
        
    }
}