package BinarySearch;

class ShipWithinDays {
    public static int shipWithinDays(int[] weights, int days) {
        int maxCap=sumAll(weights);
        int minCap=maxEle(weights);
        while(minCap<maxCap){
            int mid=(minCap+maxCap)/2;
            if(isShipped(weights,mid,days)){
                maxCap=mid;
            }
            else{
                minCap=mid+1;
            }
        }
        return minCap;
        
    }

    public static int maxEle(int [] a){
        int max=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }

    public static int sumAll(int [] a){
        int sum=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        return sum;
    }

    public static Boolean isShipped(int [] a, int cap, int days){
        int sum=0,d=1;
        int n=a.length;
        int i=0;
        while(i<n){
            if((sum+a[i])>cap){
                sum=a[i];
                d++;
            }
            else{
                sum+=a[i];
            }
            i++;
        }
        if(d<=days){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int days=3;
        System.out.println(shipWithinDays(arr,days));
    }
}
