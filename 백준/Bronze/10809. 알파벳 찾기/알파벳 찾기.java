import java.util.*;


public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] alpabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o",
                "p","q","r","s","t","u","v","w","x","y","z"};
        int[] count= new int[26];

        Arrays.fill(count,-1);

        String str = scanner.nextLine();

        for(int i=0; i<str.length(); i++){

            for(int j=0; j<alpabet.length; j++){

                if((str.charAt(i)+"").equals(alpabet[j])){

                    count[j]=str.indexOf(str.charAt(i));


                    break;
                }


            }


        }
        
        String strstr ="";
        
        for(int i=0; i<count.length; i++){
            
            strstr+=count[i]+" ";
            
        }



        System.out.println(strstr.trim());







    }
}