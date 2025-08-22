import java.util.ArrayList;

public class SubArray {

    public static ArrayList<ArrayList<Integer>> getSubArray(int a []){
        int n=a.length;

        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> subArray=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int k=i;
                while (k<=j) {
                    subArray.add(a[k]);
                    k++;
                }
                result.add(new ArrayList<>(subArray));
                subArray.removeAll(subArray);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        
        int a[] ={1,2,3};
        System.out.println(getSubArray(a));
    }
}