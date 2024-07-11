

public class permutation_string {
    public static void main(String[] args) {
        fun("abc","");
    }
    public static void fun(String given,String ans){
        if(given.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=given.charAt(0);
        for(int i=0;i<=ans.length();i++){
            String First=ans.substring(0, i);
            String Second=ans.substring(i);
            fun(given.substring(1),First+ch+Second);
        }
    }
    
}
