
import java.util.*;
public class permutation_string {
    public static void main(String[] args) {
        ArrayList<String> arrr=new ArrayList<>();
        fun("abc","",arrr);
        // fun2("abc","");
        System.out.println(arrr);
    }
    public static void fun(String given,String ans,  ArrayList<String> arrr){
        if(given.isEmpty()){
           arrr.add(ans);
            return;
        }
        char ch=given.charAt(0);
        for(int i=0;i<=ans.length();i++){
            String First=ans.substring(0, i);
            String Second=ans.substring(i);
            fun(given.substring(1),First+ch+Second,arrr);
        }
    }
     
    
}
