import java.util.*;

public class shortWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++){

            int count = 1;

            while(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)){
                count++;
                i++;
            }

            if(count == 1)
                System.out.print(s.charAt(i));
            else
                System.out.print(s.charAt(i) + "" + count);
        }
    }
}

//method 2 using StringBuilder
import java.util.*;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            int count = 1;
            while(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)){
                count++;
                i++;
            }
            if(count == 1)
                sb.append(s.charAt(i));
            else
                sb.append(s.charAt(i)).append(count);
        }
        System.out.println(sb.toString());
    }
}
