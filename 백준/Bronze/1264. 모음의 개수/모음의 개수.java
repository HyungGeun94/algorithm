import java.util.*;


public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            String str = scanner.nextLine();

            if (str.equals("#")) {
                break;

            }

            int count=0;

            char[] charArray = str.toLowerCase().toCharArray();

            for (char c : charArray) {

                if(vowelCheck(c)){
                    count++;
                }
            }

            System.out.println(count);


        }



    }

    private static boolean vowelCheck(char c) {

        return c=='a' || c== 'e' || c == 'o' || c == 'i' || c== 'u';

    }


    }

