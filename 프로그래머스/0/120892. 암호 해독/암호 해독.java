class Solution {
    public String solution(String cipher, int code) {
        
        StringBuffer sb = new StringBuffer();

        char[] ch = cipher.toCharArray();
        
        for(int i=code-1 ; i<ch.length; i+=code){
            sb.append(ch[i]);
        }
        
        return new String(sb);
    }
}