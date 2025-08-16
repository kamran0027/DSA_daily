public class SecondLargestWithoutSorting {

    public static int secondLrgst(int arr [] ){
        int n=arr.length;
        int lr,slr;
        lr=arr[0];
        slr=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>lr){
                slr=lr;
                lr=arr[i];
                
            }
            else{
                if(arr[i]>slr){
                    slr=arr[i];
                }
            }
        }
        return slr;
    }

    public static void main(String[] args) {
        int arr[]={1,78,5,41,96,123};
        System.out.println(secondLrgst(arr));
    }

}
