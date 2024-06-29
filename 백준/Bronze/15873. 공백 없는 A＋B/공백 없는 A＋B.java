import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        if(number.length()==4){
            System.out.println(20);
        }
        else if(number.length()==3){
            if(number.charAt(1)=='0')
            System.out.println(10+(number.charAt(2)-'0'));
            else{
                System.out.println(number.charAt(0)-'0'+10);
            }
        }else{
            System.out.println(number.charAt(0)-'0'+number.charAt(1)-'0');
        }


    }
}