public class isArraySorted {
    public static void main(String[] args) {
        int flag=0;
        int [] arr={1,2,3,5,6};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                continue;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println("true");
        else
        System.out.println("flase");
    }
    
}
