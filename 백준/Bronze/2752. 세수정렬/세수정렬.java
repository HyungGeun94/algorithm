import java.util.*;

class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[] array = new int[3];

        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        array[2] = scanner.nextInt();

        Arrays.sort(array);

        for (int i : array) {
            System.out.print(i+" ");
        }


    }
}