package funcandmethods;

public class swap {
    public static void swap(int a, int b){
        int any= a;
        a=b;
        b=any;
        System.out.println("after swapping a= "+a );
        System.out.println("after swapping b= "+b );
    }
    public static void main(String[] args) {
        int a=1;
        int b =2;
swap( a, b);    //in java call by value is occurs when we givethe value of any variable
                //call by value cha concept baghun ghe
    }
}
