import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int comparedNum = in.nextInt();
        
        StringBuffer sb = new StringBuffer();


        for (int i = 0; i < size; i++) {

            int comparingNum = in.nextInt();
            if(comparedNum>comparingNum){
                sb.append(comparingNum).append(" ");

            }

        }

        System.out.println(sb.toString().trim());



        in.close();
    }
}
