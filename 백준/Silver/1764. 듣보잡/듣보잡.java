import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.nextLine(); 

        Set<String> set = new HashSet<>();
        List<String> duplicateList = new ArrayList<>();

        for (int i = 0; i < start; i++) {
            set.add(scanner.nextLine());
        }

        for (int i = 0; i < end; i++) {
            String str = scanner.nextLine();
            if (set.contains(str)) {
                duplicateList.add(str);
            }
        }

        Collections.sort(duplicateList);

        System.out.println(duplicateList.size());
        for (String s : duplicateList) {
            System.out.println(s);
        }

        scanner.close();
    }
}
