import java.util.*;

public class FirstRepeating{
    
    public static void main(String[] args){
        
        int a[]={1,2,3,3,1};
        boolean flag=false;

        for(int i = 0; i < a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if( a[i] == a[j] ){
                    System.out.println(a[i]);
                    flag=true;
                    break;
                }

                if(flag==true)
                    break;
                else
                    continue; 
            }

            if(flag==true)
                break;

            else
                continue;
        }

    }

}