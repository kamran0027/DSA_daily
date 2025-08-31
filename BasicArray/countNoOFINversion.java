public class countNoOFINversion {
    //brute force approach
    static int countInversion(int arr[],int n){
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    // optimal approach using merge sort
    static int mergeSort(int arr[],int low,int high){
        int result=0;
        if(low<high){
            int mid=(high+low)/2;
            int lCount=mergeSort(arr, low, mid);
            int hCount=mergeSort(arr, mid+1, high);
            int count=merge(arr,low,mid,high); 
            result+= lCount+hCount+count;
        }
        return result;
         
    }

    static int merge(int a[], int l, int m, int h){
        int n1=m-l+1;
        int n2=h-m;
        int larr[]=new int[n1];
        int rarr[]=new int[n2];
        for(int i=0;i<n1;i++){
            larr[i]=a[l+i];
        }
        for(int i=0;i<n2;i++){
            rarr[i]=a[m+i+1];
        }

        int count=0;
        int i=0,j=0,k=l;
        while (i<n1 && j<n2) {
            if (larr[i]<=rarr[j]) {
                a[k]=larr[i];
                i++;
                k++;
            }
            else{
                a[k]=rarr[j];
                count+=(n1-i);
                j++;
                k++;
            }
        }
        while (i<n1) {
            a[k]=larr[i];
            i++;
            k++;
        }
        while (j<n2) {
            a[k]=rarr[j];
            j++;
            k++;
        }
        return count;

    }
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        int n=arr.length;
        System.out.println(mergeSort(arr,0,n-1));
    }
}
