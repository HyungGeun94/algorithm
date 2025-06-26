class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        
        for(int i=0; i<db.length; i++){
            
            String id = db[i][0];
            String password = db[i][1];
            
            if(id.equals(id_pw[0]) && password.equals(id_pw[1])){
                answer =  "login";
                break;
                
            }else if(id.equals(id_pw[0]) && !password.equals(id_pw[1])){
                answer = "wrong pw";
            }
        }
        
        return answer;
    }
}