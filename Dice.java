public class Dice {
    public static void main(String[] args) {
        fun(4,"");
    }
    public static void fun(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        for(int i=1;(i<=6 )&& i<=n;i++){
            fun(n-i,ans+i);
        }

    }
    
}
