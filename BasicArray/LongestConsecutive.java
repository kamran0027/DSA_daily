import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        if(nums.length==0){
            return 0;
        }
        for(int i:nums){
            set.add(i);
        }
        int maxlen=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int x=i;
                int curlen=1;
                while(set.contains(x+1)){
                    curlen++;
                    x=x+1;
                }
                maxlen=Math.max(maxlen,curlen);
                
            }
            
        }
        return maxlen;
    }

}
