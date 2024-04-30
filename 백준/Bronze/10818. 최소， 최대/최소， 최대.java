import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int max = scanner.nextInt();
        int min = max;
        for(int i=1; i<size; i++){
            int num = scanner.nextInt();
            if(max<num){
                max=num;
            }else if(min>num){
                min=num;
            }
            
        }
        
        System.out.println(min+ " "+max);
        
        


    }
}
