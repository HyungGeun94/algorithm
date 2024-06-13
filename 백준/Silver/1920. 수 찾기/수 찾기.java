import java.util.*;


public class Main{

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<count; i++){
            set.add(scanner.nextInt());
        }

        count = scanner.nextInt();

        for(int i=0; i<count; i++){

            int container = scanner.nextInt();
            if(set.contains(container)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }


        }

    }
}