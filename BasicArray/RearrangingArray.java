public class RearrangingArray {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] result=new int[n];
        int pidx=0,nidx=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                result[pidx]=nums[i];
                pidx=pidx+2;
            }
            else{
                result[nidx]=nums[i];
                nidx+=2;
            }
        }
        return result;
    }
    
}
