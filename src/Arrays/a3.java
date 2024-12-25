package Arrays;

public class a3 {

public static int lsearch(int marks[],int key){
    for(int i=0 ;i<=marks.length;i++){
        if(marks[i]==key){
            return (i);
        }
    }
    return -1;
}

    public static void main(String[] args) {
        int marks[]={12,23,34,24};
        int key=34;
        int index=lsearch(marks,key);
        if(index==-1){
            System.out.println("not found");
        }
        else {
            System.out.println("index number of key is" + index);
        }

    }
}
