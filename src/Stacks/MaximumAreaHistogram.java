package Stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MaximumAreaHistogram {

    public static List<Integer> nearestSmallerLeft(int[] arr,int size){

        Stack<Integer> indexStack=new Stack<>();
        Stack<Integer> valueStack=new Stack<>();

        List<Integer> left=new ArrayList<>();

        for(int i=0;i<size;i++){

            while(!valueStack.isEmpty() && valueStack.peek()>=arr[i]){

                valueStack.pop();
                indexStack.pop();
            }

            if(valueStack.isEmpty()){

                left.add(-1);
            }

            if(!valueStack.isEmpty() && valueStack.peek()<arr[i]){

                left.add(indexStack.peek());
            }

            indexStack.push(i);
            valueStack.push(arr[i]);
        }

        return left;

    }


    public static List<Integer> nearestSmallerRight(int[] arr,int size){

        Stack<Integer> indexStack=new Stack<>();
        Stack<Integer> valueStack=new Stack<>();

        List<Integer> right=new ArrayList<>();

        for(int i=size-1;i>=0;i--){

            while(!valueStack.isEmpty() && valueStack.peek()>=arr[i]){

                valueStack.pop();
                indexStack.pop();
            }

            if(valueStack.isEmpty()){

                right.add(size);
            }

            if(!valueStack.isEmpty() && valueStack.peek()<arr[i]){

                right.add(indexStack.peek());
            }

            valueStack.push(arr[i]);
            indexStack.push(i);
        }

        Collections.reverse(right);
          return  right;
    }

    public static void main(String[] args) {

        int[] arr={6,2,5,4,5,1,6};

        int size=arr.length;

        List<Integer> left=nearestSmallerLeft(arr,size);
        List<Integer> right=nearestSmallerRight(arr,size);


        int maxArea=(right.get(0) - left.get(0) - 1) * arr[0];

        for(int i=1;i<size;i++){

            if(arr[i] * (right.get(i) - left.get(i) - 1)>maxArea){

                maxArea=(right.get(i) - left.get(i) - 1) * arr[i] ;
            }
        }

        System.out.println(maxArea);

    }
}
