import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        
        int y = scanner.nextInt();
        
        int w = scanner.nextInt();
        
        int h = scanner.nextInt();
        
        int xwidth =  w-x > x ? x : w-x ;
        
        int ywidth =  h-y > y ? y : h-y ;
        
        System.out.println(xwidth > ywidth ? ywidth : xwidth);













    }
}
