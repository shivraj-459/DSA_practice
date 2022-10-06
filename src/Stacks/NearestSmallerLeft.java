package Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestSmallerLeft {


    public static List<Integer> NearestSmaller(int[] arr,int size){


        Stack<Integer> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<size;i++){

            while (!stack.isEmpty() && stack.peek()>arr[i]){

                stack.pop();
            }

            if(stack.isEmpty()){

                list.add(-1);
            }

            if(!stack.isEmpty() && stack.peek()<=arr[i]){

                list.add(stack.peek());
            }

            stack.push(arr[i]);
        }

          return list;
    }

    public static void main(String[] args) {

        int[] arr={4,5,2,10,8};

        int size=arr.length;

        List<Integer> output=NearestSmaller(arr,size);
        System.out.println(output);

    }
}
