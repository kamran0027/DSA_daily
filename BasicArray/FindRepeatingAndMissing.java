import java.util.HashMap;
import java.util.Map;

public class FindRepeatingAndMissing {
    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int arr []=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=nums.length;i++){
            map.put(i,0);
        }
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.get(nums[i])+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==0){
                arr[1]=entry.getKey();
            }
            else if(entry.getValue()==2){
                arr[0]=entry.getKey();
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        
        int arr[]={3, 5, 4, 1, 1};
        int result[]=findMissingRepeatingNumbers(arr);
        System.out.println("Repeating number: "+result[0]);
        System.out.println("Missing number: "+result[1]);
    }
}
