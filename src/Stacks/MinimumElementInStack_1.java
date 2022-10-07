package Stacks;

import java.util.Stack;

public class MinimumElementInStack_1 {


    static Stack<Integer> stack=new Stack<>();
    static Integer minElem;

    public static void pushElem(int data){

        if(stack.isEmpty()){
            stack.push(data);
            minElem=data;
        }

        if(data<minElem){
            stack.push(2*data - minElem);
            minElem=data;
        }

        else {
            stack.push(data);
        }
    }

    public static void popElem(){

        if(stack.isEmpty()){
            return;
        }

        if(stack.peek()<minElem){
            minElem=2 * minElem - stack.peek();
            return;
        }
      stack.pop();
    }

    public static int minElemStack(){

        if(stack.isEmpty()){
            return -1;
        }
        return minElem;
    }

    public static int top(){

        if(stack.isEmpty()){
            return -1;
        }
        if(stack.peek()<=minElem){
            return minElem;
        }
        return stack.peek();
    }

    public static void main(String[] args) {

        int[] arr={18,19,29,15,16};

        pushElem(arr[0]);
        pushElem(arr[1]);
        pushElem(arr[2]);
        pushElem(arr[3]);
        pushElem(arr[3]);
        popElem();
        popElem();
        System.out.println(top());

        System.out.println(minElemStack());

    }
}
