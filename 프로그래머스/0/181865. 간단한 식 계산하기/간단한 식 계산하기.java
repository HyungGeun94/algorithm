class Solution {
    public int solution(String binomial) {

        String[] strArr = binomial.split("\\s+");

        
        int a = Integer.parseInt(strArr[0]);


        int b = Integer.parseInt(strArr[2]);


        String buho = strArr[1];

        
        return buho.equals("+") ? a+b : buho.equals("-") ? a-b : a*b;
    }
}