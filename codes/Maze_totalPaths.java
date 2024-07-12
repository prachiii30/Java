public class Maze_totalPaths {
    public static void main(String[] args) {
       int ans=fun(3,3);
       System.out.println(ans);
    }
    public static int fun(int r,int c){
       
        if(r==1 || c==1)
        {
            return 1;
        }
        int left=fun(r-1,c);
        int right=fun(r,c-1);
        return left+right;
    }
}
