class maxSum{
    public static void main(String[] args) {
        
        int [] arr={100,200,-200,200,300};
        int k=4;
        int ws=0,sum=0,max=0;
        for(int we=0;we<arr.length;we++){
            if((we-ws+1)>k){
                sum=sum-arr[ws];
                ws++;
                sum=sum+arr[we];
            }
            if((we-we+1)<=k){
                sum=sum+arr[we];
            }
            max=Math.max(sum,max);

        }
        System.out.println(max);

    }
}