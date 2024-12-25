package operators;
import java.util.*;
public class arithmaticoperators {
    public static void main(String arg[]){
        /* binary operators


        int A = 20;
        int B = 10;
        System.out.println("addition is " + (A+B));
        System.out.println("subtraction is " + (A-B));
        System.out.println("mult is " + (A*B));
        System.out.println("division is " + (A/B));
        System.out.println("remainder is " + (A%B));
         */
        //unary operators
       /* int A = 10;
        int B = ++A;
        System.out.println(A); // due  to ++A firstly the value of A is changed to 11
        System.out.println(B);

        */

        int A = 10;
        int B = A++;
        System.out.println(A); //in post increament operator firtly value of A is use and then it gets incremented
        System.out.println(B);

        // same for decrement operator
    }
}
