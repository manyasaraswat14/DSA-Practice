import java.util.*;
public class palindrome {
    public static void check(String str){
        int i=0;
        int j= str.length()-1;
        boolean flag=true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
             flag= false;
             break;
            }
            i++;
            j--;
        }
        System.out.println(flag);
    }
    public static void main(String[] args) {
        String str="aba";
        check(str);
    }
}
