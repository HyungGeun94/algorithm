import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int standard = scanner.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++){

            arr[i] = scanner.nextInt();
        }

        Arrays.stream(arr)
                .filter(i -> i < standard)
                .forEach(i -> System.out.print(i+" "));
    }
}