package recursion.subSequences;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {

        int[] arr={2,3,6,7};
        int k=7;
        List<Integer> p=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

         printSubSeq(0,p,arr,k,ans);

        System.out.println(ans);
    }

    public static void printSubSeq(int index, List<Integer> p, int[] up, int k,List<List<Integer>> ans){

        if(index>=up.length){

            if(k==0){
                ans.add(new ArrayList<>(p));
            }
            return;
        }

        if(up[index]<=k) {
            p.add(up[index]);
            printSubSeq(index, p, up, k - up[index],ans);
            p.remove(p.size() - 1);

        }
         printSubSeq(index + 1, p, up, k,ans);

    }
}
