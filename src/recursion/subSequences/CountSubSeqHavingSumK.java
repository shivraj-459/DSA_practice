package recursion.subSequences;

import java.util.ArrayList;
import java.util.List;

public class CountSubSeqHavingSumK {

    public static void main(String[] args) {

        int[] arr={1,2,1};
        int k=2;
        int output=countSubSeq(0,arr,k,0);
        System.out.println(output);

    }

    public static int countSubSeq(int index,int[] up,int k,int sum){

        if(index>=up.length){

            if(sum==k){
                return 1;
            }
            return 0;
        }

        int left=countSubSeq(index+1,up,k,sum + up[index]);
        int right=countSubSeq(index+1,up,k,sum);

        return left + right;
    }
}
