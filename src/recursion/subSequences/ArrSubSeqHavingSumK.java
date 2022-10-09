package recursion.subSequences;

import java.util.ArrayList;
import java.util.List;

public class ArrSubSeqHavingSumK {

    public static void main(String[] args) {

        int[] arr={1,2,1};
        int k=2;
        List<Integer> p=new ArrayList<>();

        subSeqHavingSumK(0,p,arr,k,0);

    }


    public static void subSeqHavingSumK(int index, List<Integer> p,int[] arr,int k,int sum){

        if(index>= arr.length){

            if(sum==k) {
                System.out.println(p);
            }
            return;
        }

        p.add(arr[index]);
        subSeqHavingSumK(index+1,p,arr,k,sum + arr[index]);
        p.remove(p.size()-1);
        subSeqHavingSumK(index+1,p,arr,k,sum);

    }
}
