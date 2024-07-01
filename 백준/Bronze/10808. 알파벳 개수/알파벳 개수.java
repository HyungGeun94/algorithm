import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] array = new int[26];

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {

            array[string.charAt(i)-'a']+=1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}