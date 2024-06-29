import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {

            String str = scanner.nextLine();

            if (str.equals("END")) {
                break;
            }

            StringBuffer sb = new StringBuffer(str);

            System.out.println(sb.reverse());


        }



    }
}