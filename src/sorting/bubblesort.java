package sorting;

public class bubblesort {
    public static void bubblesort1(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++){
            int swap=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                  int  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  swap++;
                }

            }

        }

    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]= {6,4,3,8,1,2};
        bubblesort1(arr);
        printarr(arr);
    }
}
