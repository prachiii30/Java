import java.util.ArrayList;

public class Maze2withoutObstacle {
    public static void main(String[] args) {
        ArrayList<String> ans=new ArrayList<>();
         fun(0,0,3,"",ans);
        System.out.println(ans);
    }
    public static void fun(int r,int c,int n,String res, ArrayList<String> ans){
       if(r==n-1 && c==n-1){
           ans.add(res);
           return;
       }
       if(r<n){
            fun(r+1,c,n,res+"D",ans);
       }
      if(c<n)
            fun(r,c+1,n,res+"R",ans);
    }
    }
    

