package recursion.subSequences;

import java.util.ArrayList;
import java.util.List;

public class ArrSub {

    public static void main(String[] args) {

        int[] arr={3,1,2};

        List<Integer> p=new ArrayList<>();

        printSubSeq(0,p,arr);

    }

    public static void printSubSeq(int index, List<Integer> p, int[] up){

        if(index>=up.length){

            System.out.println(p);
            return;
        }

        p.add(up[index]);
        printSubSeq(index+1,p,up);
        p.remove(p.size()-1);

         printSubSeq(index+1,p,up);

    }
}
