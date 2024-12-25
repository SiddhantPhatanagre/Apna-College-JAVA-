package conditionalstatement;
import java.util.*;

public class switchstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1 : System.out.println("number is one");
                break;
            case 2 : System.out.println(("number is two"));
                break;
            case 3 : System.out.println(("number is three"));
                break;
            case 4 : System.out.println(("number is four"));// if any case is true the automatically all cases after

            default :
                System.out.println("number is greater than four");                                                 //that is print , to avoid this we tKE BREAK STATEMENT after each case

        }
    }
}