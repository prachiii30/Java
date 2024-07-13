import java.util.ArrayList;

public class sum_ofSubset {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        int [] arr={1,2,3};
        for(int i=0;i<1<<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                if((i&(1<<j))!=0){

                  System.out.print(arr[j]);
                  sum=sum+arr[j];
                }
            }
            System.out.println("Sum +"+sum);
            System.out.println();

        }
        System.out.println(list);
    }
    
    
}
