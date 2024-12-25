package Arrays;

public class a6 {
    public static void pairs(int num[]){
        for(int i=0; i<=num.length;i++ ){
            for(int j=i+1;j<num.length;j++){
                int curr= num[i];
                System.out.print("(" +num[i] + "," +num[j] + ")");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
    pairs(num);
    }
}
