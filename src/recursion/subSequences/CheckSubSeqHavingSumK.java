package recursion.subSequences;

import java.util.ArrayList;
import java.util.List;

public class CheckSubSeqHavingSumK {

    public static void main(String[] args) {

        int[] arr={1,2,1};
        List<Integer> p=new ArrayList<>();
        int k=2;

        boolean output=checkSubSeq(0,p,arr,k,0);
        System.out.println(output);


    }


    public static boolean checkSubSeq(int index,List<Integer> p,int[] up,int k,int sum){

        if(index>=up.length){
            if(sum==k){
                System.out.println(p);
                return true;
            }
            return false;
        }

        p.add(up[index]);
        if(checkSubSeq(index+1,p,up,k,sum + up[index])){
            return true;
        }

        else{
            p.remove(p.size()-1);
           return checkSubSeq(index+1,p,up,k,sum);
        }
    }
}
