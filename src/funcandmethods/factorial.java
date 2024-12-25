package funcandmethods;

public class factorial {
    public static int factorial(int n){
        int a = 1;
        for (int i=1;i<=n;i++){
            a=a*i;}
        return a;
    }

    public static void main(String[] args) {

        int q = factorial(4);
        System.out.println(q);


    }
}

