public class maxWindowSize {
    public static void main(String[] args) {
        int [] arr={2,50,1,1,100};
        int k=14;

        int maxLen=0;
        int sum=0;
        int ws=0;
        for(int we=0;we<arr.length;we++){
            sum=sum+arr[we];
            if(sum<=k){
                maxLen=Math.max(maxLen,we-ws+1);
            }
            if(sum>k){
                sum=sum-arr[ws];
                ws++;
                sum=sum+arr[we];
            }
           
        }
        System.out.println(maxLen);

    }
}
