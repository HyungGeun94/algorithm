import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        boolean isChanged = true;

        while (isChanged) {
            isChanged = false;
            int[] prevArr = Arrays.copyOf(arr, arr.length);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2; 
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1; 
                }
            }


            if (!Arrays.equals(arr, prevArr)) {
                isChanged = true; 
            }

            count++; 
        }

        return count - 1; // 반복이 멈추는 순간은 한 번 더 카운트되므로 1을 뺌
    }
}