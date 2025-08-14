public class ReverseArray {
    public  void reverseArray(int arr[], int n){
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }
      
    
}
