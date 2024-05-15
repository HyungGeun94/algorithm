class Solution {
    public int solution(int balls, int share) {
        // 오버플로우를 방지하기 위해 long 타입으로 선언
        long answer = 1;
        
        // 공식을 사용하여 구슬을 나누는 경우의 수 계산
        for (int i = 0; i < share; i++) {
            // 공식에 따라 결과값 계산 (n! / (m! * (n-m)!))
            answer *= (balls - i);
            answer /= (i + 1);
        }
        
        // 정수형으로 반환
        return (int) answer;
    }
}
