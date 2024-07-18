import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i]=scanner.nextInt();
        }

        int standard = scanner.nextInt();

        System.out.println(Arrays.stream(arr).filter(i -> i == standard).count());


    }

}