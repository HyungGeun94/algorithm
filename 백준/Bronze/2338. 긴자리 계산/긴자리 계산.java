import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger bigIntegerA = scanner.nextBigInteger();
        BigInteger bigIntegerB = scanner.nextBigInteger();

        System.out.println(bigIntegerA.add(bigIntegerB));
        System.out.println(bigIntegerA.subtract(bigIntegerB));
        System.out.println(bigIntegerA.multiply(bigIntegerB));




    }
}