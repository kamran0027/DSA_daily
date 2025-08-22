import java.util.HashMap;
import java.util.Map;

public class SubArrayWithK {
    // first approach.............
    public  int subarraySum1(int[] nums, int x) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                    sum+=nums[j];
                    if(sum==x)count++;
                }
        }
        return count;
    }

    public int subarraySum2(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int [] prefixSum=new int[n];
        prefixSum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<n;j++){
            if(prefixSum[j]==k){
                count++;
            }
            int val=prefixSum[j]-k;
            if(map.containsKey(val)){
                count+=map.get(val);
            }
            if(map.containsKey(prefixSum[j])){
                map.put(prefixSum[j],map.get(prefixSum[j])+1);
            }
            else{
                map.put(prefixSum[j],1);
            }
            
        }
        return count;
        
    }
}
