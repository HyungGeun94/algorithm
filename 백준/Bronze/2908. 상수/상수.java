import java.util.*;


public class Main{

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);


        StringBuffer sb = new StringBuffer(scanner.nextInt()+"");
        sb.reverse();
        int number1 = Integer.parseInt(sb.toString());


        sb = new StringBuffer(scanner.nextInt()+"");
        sb.reverse();
        int number2 = Integer.parseInt(sb.toString());


        System.out.println(Math.max(number1,number2));






    }
}