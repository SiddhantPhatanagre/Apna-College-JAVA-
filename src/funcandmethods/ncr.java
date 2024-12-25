package funcandmethods;

public class ncr {
    public static int factorial(int k){
        int a = 1;
        for (int i=1;i<=k;i++){
            a=a*i;}
        return a;
    }
    public static int ncr(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int ans = fact_n/fact_r * fact_nmr;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(ncr(2,3));

    }
}

