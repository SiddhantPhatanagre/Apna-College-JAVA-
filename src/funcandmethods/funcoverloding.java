package funcandmethods;

public class funcoverloding {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println(a + b + c) ;
        return 0;     //as pn kru shakto pn nko krt jau

    }
    public static float sum(float a , float b){
        return (a+b);
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 4));
        sum(2, 4,8);
        System.out.println(sum(2.3f,3.4f));
    }
}//fuctional overloding can be done by changing the type of paramenters and numbe of parameters