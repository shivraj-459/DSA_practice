package recursion.subSequences;

import java.util.ArrayList;
import java.util.List;

public class CountSubSeqHavingSumK {

    public static void main(String[] args) {

        int[] arr={1,2,1};
        int k=2;
        List<Integer> p=new ArrayList<>();

        int output=countSubSeq(0,p,arr,k,0);
        System.out.println(output);

    }

    public static int countSubSeq(int index, List<Integer> p,int[] up,int k,int sum){

        if(index>=up.length){

            if(sum==k){
                System.out.println(p);
                return 1;
            }
            return 0;
        }

        p.add(up[index]);
        int left=countSubSeq(index+1,p,up,k,sum + up[index]);
        p.remove(p.size()-1);

        int right=countSubSeq(index+1,p,up,k,sum);

        return left + right;
    }
}
