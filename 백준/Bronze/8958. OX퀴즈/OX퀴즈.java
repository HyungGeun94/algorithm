import java.util.*;


public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<number; i++){
            int sum=0;
            int score = 1;
            
            String str = scanner.nextLine();

            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)=='O'){
                    sum+=score;
                    score++;
                }else{
                    score=1;

                }

            }
            System.out.println(sum);

        }


    }
}