package recursion.subSequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetSums {


    public static void main(String[] args) {

        int[] arr={3,1,2};
        List<Integer> ans=new ArrayList<>();

        findSubsetSums(0,arr,ans,0);

        Collections.sort(ans);
        System.out.println(ans);

    }

    public static void findSubsetSums(int index,int[] up,List<Integer> ans,int sum){

        if(index>=up.length){
            ans.add(sum);
            return;
        }

        findSubsetSums(index+1,up,ans,sum+up[index]);
        findSubsetSums(index+1,up,ans,sum);
    }
}
