package recursion.permutations;

import java.util.ArrayList;
import java.util.List;

public class PermutationArray_II {

    public static void main(String[] args) {

        int[] arr={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();

        findPermutations(0, arr,ans);
        System.out.println(ans);

    }

    public static void findPermutations(int index, int[] arr, List<List<Integer>> ans){

        if(index==arr.length){
            List<Integer> p=new ArrayList<>();

            for(int i=0;i<arr.length;i++){
                p.add(arr[i]);
            }
            ans.add(new ArrayList<>(p));
            return;
        }

        for(int i=index;i<arr.length;i++){
          swap(index,i,arr);
          findPermutations(index+1,arr,ans);
          swap(index,i,arr);
        }


    }

    private static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
