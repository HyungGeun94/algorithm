import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에서 숫자의 개수 N을 입력받음
        int N = scanner.nextInt();
        scanner.nextLine();  // 개행 문자 제거
        
        // 두 번째 줄에서 공백 없이 주어진 숫자 N개를 문자열로 입력받음
        String numbers = scanner.nextLine();
        
        // 숫자 합계를 저장할 변수
        int sum = 0;
        
        // 문자열의 각 문자를 숫자로 변환하여 합산
        for (int k = 0; k < numbers.length(); k++) {
            sum += numbers.charAt(k) - '0';
        }
        
        // 합계를 출력
        System.out.println(sum);
        
        // Scanner 객체 닫기
        scanner.close();
    }
}
