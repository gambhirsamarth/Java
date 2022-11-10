import java.util.*;
public class StringMultiply{
    public static void main(String args[]){

        String str1, str2;

        Scanner sc=new Scanner(System.in);

        str1=sc.nextLine();
        str2=sc.nextLine();

        int ans;

        ans=( Integer.parseInt(str1) * Integer.parseInt(str2) );
        System.out.println(ans);
    }
}