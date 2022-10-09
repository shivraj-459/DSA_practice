package recursion.subSequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsNoDuplicate {

    public static void main(String[] args) {

        int[] arr={2,1,2};

        List<Integer> p=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(arr);
       // printUniqueSubSets(0,p,arr,ans);

        //System.out.println(ans);

        System.out.println(subsetDuplicate(arr));



    }

    public static void printUniqueSubSets(int index, List<Integer> p,int[] up,List<List<Integer>> ans){

        ans.add(new ArrayList<>(p));

        for(int i=index;i<up.length;i++){

            if(i>index && up[i]==up[i-1]){
                continue;
            }

            p.add(up[i]);
            printUniqueSubSets(i+1,p,up,ans);
            p.remove(p.size()-1);
        }

    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;


        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
