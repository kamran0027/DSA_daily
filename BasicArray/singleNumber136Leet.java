import java.util.HashMap;
import java.util.Map;

public class singleNumber136Leet {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val=map.get(nums[i]);
                val++;
                map.put(nums[i],val);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> res : map.entrySet()){
            if(res.getValue()==1){
                return res.getKey();
            }
        }

        return -1;

        
    }

}
