package variables;

public class basics8 {
    public static void main(String[] args) {
        byte a = 10;
       // a= a * 3;  wrong method

        a= (byte) (a *3);
        System.out.println(a);

    }
}