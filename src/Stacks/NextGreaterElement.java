package Stacks;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class NextGreaterElement {

    public static Vector<Integer> nextGreater(int[] arr,int size){

        Stack<Integer> stack=new Stack<>();
        Vector<Integer> vector=new Vector<>();

        for(int i=size-1;i>=0;i--){

            while(!stack.isEmpty() && stack.peek()<=arr[i]){

                stack.pop();

            }

            if(stack.isEmpty()){

                vector.add(-1);
            }

            if(!stack.isEmpty() && stack.peek()>arr[i]){

                vector.add(stack.peek());
            }

            stack.push(arr[i]);
        }


        Collections.reverse(vector);

        return vector;

    }

    public static void main(String[] args) {

        int[] arr={1,3,0,0,1,2,4};

        int size=arr.length;

        Vector<Integer> output=nextGreater(arr,size);
        System.out.println(output);

    }
}
