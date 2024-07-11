import java.util.ArrayList;

public class linearSearch_usningRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,5,6,7,8};
        int t=4;
        ArrayList<Integer> list=new ArrayList<>();
        linearSearchApproach1(arr, t, 0,list);

        
        ArrayList<Integer> ans=linearSearchApproach2(arr, t,0);
        System.out.println(ans);
        
    }
    public static void linearSearchApproach1(int[]arr, int t,int inx, ArrayList<Integer> list){
        if(inx==arr.length){
            System.out.println(list);
            return;
        }
        if(arr[inx]==t){
            list.add(inx);
        }
        linearSearchApproach1(arr, t, inx+1, list);
    }

    public static ArrayList<Integer> linearSearchApproach2(int [] arr ,int t,int inx){
        ArrayList <Integer>list=new ArrayList<>();
        if(inx==arr.length){
            return list;
        }
        if(arr[inx]==t){
            list.add(inx);
        }
        ArrayList<Integer> ansFromBelowFunctionClaas=linearSearchApproach2(arr,t,inx+1);
        list.addAll(ansFromBelowFunctionClaas);
        return list;
    }
    
    
}
