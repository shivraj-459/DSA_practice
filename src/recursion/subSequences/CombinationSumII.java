package recursion.subSequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public static void main(String[] args) {

        int[] arr={1,1,2,2,1};
        int k=4;

        List<Integer> p=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(arr);

        printSubSeq(0,p,arr,k,ans);
        System.out.println(ans);

    }

    public static void printSubSeq(int index,List<Integer> p,int[] up,int k,List<List<Integer>> ans){

        if(k==0){
            ans.add(new ArrayList<>(p));
            return;
        }

        for(int i=index;i<up.length;i++){
            if(i>index && up[i]==up[i-1]){
                continue;
            }
            if(k<up[i]){
                break;
            }
            p.add(up[i]);
            printSubSeq(i+1,p,up,k-up[i],ans);
            p.remove(p.size()-1);
        }
    }
}
