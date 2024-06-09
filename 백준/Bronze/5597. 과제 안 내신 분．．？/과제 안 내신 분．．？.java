import java.util.*;


public class Main{

    public static void main(String[] args){

        Set<Integer> set = new TreeSet<>();
        Set<Integer> totalset = new TreeSet<>();

        Scanner scanner = new Scanner(System.in);



        for(int i=1; i<=30; i++){
            totalset.add(i);
        }

        for(int i=1; i<=28; i++) {
            set.add(scanner.nextInt());
        }

        totalset.removeAll(set);

        List<Integer> list = new ArrayList<>(totalset);

        Collections.sort(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));


    }
}