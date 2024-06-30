import java.util.ArrayList;

class generateSubarray{
    public static void main(String [] args){
        int [] arr={1,2,3,4,6,5};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){  
                ArrayList<Integer> li=new ArrayList<>();
                for(int k=i;k<=j;k++){
                    li.add(arr[k]);
                }
                System.out.println(li);
                // System.out.println();
            }
            System.out.println();
        }
        
    }
}