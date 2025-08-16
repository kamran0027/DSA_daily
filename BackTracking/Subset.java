package BackTracking;

import java.util.ArrayList;

public class Subset {
    public static void allSubset(int [] arr, ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> result,int i){
        if(i==arr.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[i]);
        allSubset(arr, ans, result, i+1);
        ans.removeLast();
        allSubset(arr, ans, result, i+1);
    }
    public static void main(String[] args) {

        int [] arr={1,2,3,4};
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        allSubset(arr, ans, res, 0);
        System.out.println(res.toString());

    }

}
