package recursion.permutations;

import java.util.ArrayList;
import java.util.List;

public class PermutationArray_I {

    public static void main(String[] args) {

        int[] arr={1,2,3};
        boolean[] freq=new boolean[arr.length];
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> p=new ArrayList<>();

        findPermutations(arr,freq,ans,p);
        System.out.println(ans);

    }

    public static void findPermutations(int[] arr,boolean[] freq,List<List<Integer>> ans,List<Integer> p){

        if(p.size()==arr.length){
            ans.add(new ArrayList<>(p));
            return;
        }

        for(int i=0;i<arr.length;i++){

            if(!freq[i]){

                freq[i]=true;
                p.add(arr[i]);
                findPermutations(arr,freq,ans,p);
                p.remove(p.size()-1);
                freq[i]=false;
            }
        }

    }
}
