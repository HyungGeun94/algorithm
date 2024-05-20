import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<int[]> distNumList = new ArrayList<>();
        
        for (int num : numlist) {
            int dist = Math.abs(num - n);
            distNumList.add(new int[]{dist, num});
        }
        
        Collections.sort(distNumList, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) { 
                    return a[0] - b[0];
                } else { 
                    return b[1] - a[1];
                }
            }
        });
        
        int[] result = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            result[i] = distNumList.get(i)[1];
        }
        
        return result;
    }
}
