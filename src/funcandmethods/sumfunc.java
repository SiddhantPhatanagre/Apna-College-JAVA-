package funcandmethods;
import java.util.*;
public class sumfunc {
    public static void sum(int a, int b){ //int a and int b are formal parameters (formal para define when function is define
        int add = a+b;
        System.out.println("sum is "+ add);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b); //a and b is actual parameters (actual parameters are parameters when we calls a function
    }
}
