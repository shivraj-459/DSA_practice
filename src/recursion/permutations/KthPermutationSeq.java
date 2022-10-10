package recursion.permutations;

import java.util.ArrayList;
import java.util.List;

public class KthPermutationSeq {
    public static void main(String[] args) {

        System.out.println(findKthPermutation(4,17));

    }

   public static String findKthPermutation(int n,int k){

        int fact=1;
       List<Integer> numbers=new ArrayList<>();

        for(int i=1;i<n;i++){
            fact=fact * i;
            numbers.add(i);
        }

        numbers.add(n);
        k=k-1;
        StringBuilder ans= new StringBuilder();

        while(true){
            ans.append(numbers.get(k / fact)).append(" ");
            numbers.remove(k/fact);

            if(numbers.size()==0){
                break;
            }
            k=k % fact;
            fact = fact/numbers.size();
        }


       return ans.toString();

   }
}
