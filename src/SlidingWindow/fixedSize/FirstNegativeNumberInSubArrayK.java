package SlidingWindow.fixedSize;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeNumberInSubArrayK {

    public static void main(String[] args) {
        int[] arr={12,-1,-7,8,-15,30,16,28};
        int k=3;

        List<Integer> output=returnFirstNegativeList(arr,k);
        System.out.println(output);

    }

    static List<Integer> returnFirstNegativeList(int[] arr,int k){

        int start=0;
        int end=0;
        List<Integer> output=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();

        while(end< arr.length){

            if(arr[end]<0){
                queue.add(arr[end]);
            }

            if((end-start+1)<k){
                end++;
            }
            else if ((end-start +1)==k) {

                if(queue.isEmpty()){
                    output.add(0);
                }
                else{
                    output.add(queue.peek());

                    if(arr[start]== queue.peek()){
                        queue.poll();
                    }
                }
                start++;
                end++;
            }
        }
        return output;
    }
}
