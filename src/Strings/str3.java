package Strings;

public class str3 {
    public static boolean palindrome(String str){
        int l = str.length();
        for (int i=0;i<l/2; i++){

            if(str.charAt(i)!=str.charAt(l-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palindrome(str));;
    }
}
