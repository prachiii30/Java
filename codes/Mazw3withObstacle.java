import java.util.*;
public class Mazw3withObstacle {
   
    public static void main(String[] args) {
        int m[][] = {
        {1, 0, 0, 0},
        {1, 1, 0, 1}, 
        {1, 1, 0, 0},
        {0, 1, 1, 1}};
        ArrayList<String>res=new ArrayList<>();
        fun("",0,0,4,m,res);
        System.out.println(res);
    }
    public static void fun(String ans,int r,int c,int size,int[][] m,ArrayList<String> res){
        if(m[r][c]==0){
            return;
        }
        else{
        if(r==size-1 && c==size-1){
            res.add(ans);
            return;
        }
        if(r<size-1){
            fun(ans+"D",r+1,c,size,m,res);
        }
        if(c<size-1){
            fun(ans+"R",r,c+1,size,m,res);
        }
    }
    }   
}
