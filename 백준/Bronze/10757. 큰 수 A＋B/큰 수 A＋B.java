import java.math.BigInteger;
import java.util.*;


public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        BigInteger bigInteger1 = scanner.nextBigInteger();
        BigInteger bigInteger2 = scanner.nextBigInteger();

        System.out.println(bigInteger1.add(bigInteger2));


    }
}