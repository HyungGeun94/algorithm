import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] split = scanner.nextLine().split("/");

        if(Integer.parseInt(split[0])+Integer.parseInt(split[2])<Integer.parseInt(split[1]) || Integer.parseInt(split[1])==0){
            System.out.println("hasu");
        }else{
            System.out.println("gosu");
        }

    }
}