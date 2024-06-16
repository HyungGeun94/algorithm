import java.math.BigInteger;
import java.util.*;


public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger bigInteger = scanner.nextBigInteger();
        BigInteger bigInteger1 = scanner.nextBigInteger();

        BigInteger[] bigIntegers = bigInteger.divideAndRemainder(bigInteger1);

        System.out.println(bigIntegers[0]);
        System.out.println(bigIntegers[1]);
    }


    }

