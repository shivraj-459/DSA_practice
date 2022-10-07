package Stacks;

import java.util.Stack;

public class MinimumElementInStack_N {


    static Stack<Integer> stack=new Stack<>();
    static Stack<Integer> supportStack=new Stack<>();

    static void pushElem(int data){

        stack.push(data);

        if(supportStack.isEmpty()){

            supportStack.push(data);
        }

        else {

            if(supportStack.peek()>=data){

                supportStack.push(data);
            }
        }
    }

    static int popElem(){

        if(stack.isEmpty()){

            return -1;
        }

       if(stack.peek().equals(supportStack.peek())){

           supportStack.pop();
       }
        return stack.pop();

    }

    static int minElemInStack(){

        if(stack.isEmpty()){

            return -1;
        }

        return supportStack.peek();
    }



    public static void main(String[] args) {

           int[] arr={18,19,29,15,16};

           pushElem(arr[0]);
           pushElem(arr[1]);
           pushElem(arr[2]);
           pushElem(arr[3]);
          int ele= popElem();
        System.out.println(ele);





           int min=minElemInStack();
            System.out.println(min);

    }
}
