package Arrays;
import java.util.Arrays;

public class inbuiltsort {

    public static void Ar(int arr[]){
 for(int i=1;i<=arr.length;i++){
     System.out.print(arr[i-1]);
 }
    }

    public static void main(String[] args) {
        int arr[]= {5,2,6,9,1,3};
        Arrays.sort(arr);
        Ar(arr);

    }


}
