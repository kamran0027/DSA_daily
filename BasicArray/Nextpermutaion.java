public class Nextpermutaion {
        public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0){
            if(nums[i]<nums[i+1]){
             break;   
            }
            i--;
        }
        if(i==-1){
            reverse(nums,0,n-1);
            return;
        }
        int j=n-1;
        while(j>=0){
            if(nums[j]>nums[i]){
                break;
            }
            j--;
        }
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        reverse(nums,i+1,n-1);
        
    }

    public static void reverse(int [] a, int i, int n){
        while(i<n){
            int temp=a[i];
            a[i]=a[n];
            a[n]=temp;
            i++;
            n--;
        }
    }
    
}
