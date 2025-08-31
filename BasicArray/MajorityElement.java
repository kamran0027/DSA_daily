import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {
    public static List<Integer> majorityElementTwo(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int k=n/3;
        int count=1;
        if(k==0){

            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                if (!list.contains(nums[i])) {
                    list.add(nums[i]);
                }
                
            }
            return list;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                
            }
            if(count>k){
                list.add(nums[i]);
            }
            count=1;
            
        }
        return list;
    }

    public static void main(String[] args) {
        int a[] ={2,2};
        System.out.println(majorityElementTwo(a));
    }
}
