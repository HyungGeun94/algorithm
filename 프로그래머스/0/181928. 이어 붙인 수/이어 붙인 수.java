class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddBuilder = new StringBuilder();
        StringBuilder evenBuilder = new StringBuilder();
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                evenBuilder.append(num_list[i]);
            } else {
                oddBuilder.append(num_list[i]);
            }
        }
        
        int oddSum = Integer.parseInt(oddBuilder.toString());
        int evenSum = Integer.parseInt(evenBuilder.toString());
        
        return oddSum + evenSum;
    }
}