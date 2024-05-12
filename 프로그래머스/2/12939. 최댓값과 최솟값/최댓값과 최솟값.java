import java.util.Arrays;

class Solution {
    public String solution(String s) {
             String[] strArr = s.split(" ");

        int[] arr = new int[strArr.length];

        int idx = 0;
        for (String str : strArr) {
            arr[idx++]=Integer.parseInt(str);
        }



        Arrays.sort(arr);

        return ""+arr[0] +" "+ arr[arr.length-1];
    }
}