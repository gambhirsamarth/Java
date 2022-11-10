import java.util.*;
public class ReverseHalf{

    public static void main(String[] args){

        String inp;

        Scanner sc= new Scanner(System.in);

        inp=sc.next();

        String word1 = "", word2 = "";
        int  n= inp.length()/2;

        for(int i=0;i<n;i++){
            word1+=inp.charAt(i);
        }

        for(int j = n; j<inp.length();j++){
            word2+=inp.charAt(j);
        }

        String ans="";

        for(int i= word1.length()-1; i>=0; i--){
            ans+=word1.charAt(i);
        }

        for(int i= word2.length()-1; i>=0; i--){
            ans+=word2.charAt(i);
        }

        System.out.println(ans);

    }

}