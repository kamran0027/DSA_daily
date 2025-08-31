import java.util.ArrayList;
import java.util.List;

public class MergeInterval {

    public static List<List<Integer>> merge(int[][] intervels) {
        List<List<Integer>> list=new ArrayList<>();
        int n=intervels.length;
        //Arrays.sort(intervels);
        for(int i=0;i<n-1;i++){
            List<Integer> ans=new ArrayList<>();
            if((intervels[i][1]>=intervels[i+1][0]) && (intervels[i][1]<=intervels[i+1][1])){
                ans.add(intervels[i][0]);
                ans.add(intervels[i+1][1]);
                list.add(ans);
                i++;
            }
            else if(i==n-2){
                ans.add(intervels[n-1][0]);
                ans.add(intervels[n-1][1]);
                list.add(ans);
            }
            else{
                ans.add(intervels[i][0]);
                ans.add(intervels[i][1]);
                list.add(ans);
            }

        }
        return list;

        
    }
    public static void main(String[] args) {
        int arr [][]={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(merge(arr));
    }
}
