public class Union {

    public static int [] unionOfArray(int [] arr1, int [] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int result[]=new int[n1+n2];
        int k=0;

        int i=0,j=0;
        while(i<n1 && j<n2){
            if (arr1[i]<arr2[j]) {
                if(isPresent(result,arr1[i])){

                }
                else{
                    result[k]=arr1[i];
                    k++;
                }
                i++;
                
            }
            else{
                if(isPresent(result,arr2[j])){

                }
                else{
                    result[k]=arr2[j];
                    k++;
                }
                j++;
            
            }
        
        }
        while (i<n1) {
            if(isPresent(result,arr1[i])){

            }
            else{
                result[k]=arr1[i];
                k++;
            }
            i++;
            
        }
        while (j<n2) {
            if(isPresent(result,arr2[j])){

                }
                else{
                    result[k]=arr2[j];
                    k++;
                }
                j++;
            
        }

        // for(int i=0;i<n1;i++){
        //     result[k]=arr1[i];
        //     k++;
        // }
        // for(int i=0;i<n2;i++){
        //     if(isPresent(result,arr2[i])){

        //     }
        //     else{
        //         result[k]=arr2[i];
        //         k++;
        //     }
        // }
        return result;
    }

    public static Boolean isPresent(int [] arr, int ele){
        for(int i=0;i<arr.length;i++){
            if(ele==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int arr1[]={1,3,4,6,8};
        int arr2[]={2,7,1,6,5,8};
        int union[]=new int[arr1.length+arr2.length];
        union=unionOfArray(arr1, arr2);

        for(int i=0;i<union.length;i++){
            System.out.printf(" "+union[i]);
        }
        
    }

}
