import java.util.ArrayList;

public class generateSubset_bitwise {
    public static void main(String[] args) {
        int []arr={1,2,3};
        ArrayList<ArrayList<Integer>>result=new ArrayList<>();

        for(int i=0;i<1<<arr.length;i++){
            ArrayList<Integer>list=new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                if((i&(1<<j))!=0){
                    list.add(arr[j]);
                }
            }
            result.add(list);

        }


        System.out.println(result);


    }
    
}
