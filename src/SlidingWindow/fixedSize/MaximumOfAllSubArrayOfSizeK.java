package SlidingWindow.fixedSize;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumOfAllSubArrayOfSizeK {

    public static void main(String[] args) {

        int[] arr={3,1,-1,-3,5,3,6,7};
        int k=3;

        List<Integer> output=findMax(arr,k);
        System.out.println(output);
    }

    static List<Integer> findMax(int[] arr,int k){

        int s=0;
        int e=0;
        int size=arr.length;
        Queue<Integer> queue=new LinkedList<>();
        List<Integer> list=new ArrayList<>();

        while(e<size){

            while(!queue.isEmpty() && queue.peek()<arr[e]){
                queue.poll();
            }
            queue.add(arr[e]);

            if((e-s+1)<k){
                e++;
            }
            else if((e-s+1)==k){

                list.add(queue.peek());

                if(queue.peek()==arr[s]){
                    queue.poll();
                }
                s++;
                e++;
            }
        }
        return list;
    }
}
