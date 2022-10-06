package Stacks;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StockSpareProblem {

    public static List<Integer> stockSpare(int[] arr,int size){

        Stack<int[]> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();

        stack.push(new int[]{arr[0],0});
        list.add(1);

        for(int i=1;i<size;i++){

            int[] data= stack.peek();

            while(!stack.isEmpty() &&  data[0] <= arr[i]){

                stack.pop();
                data= stack.peek();
            }

            if(stack.isEmpty()){
                list.add(i-(-1));
            }

            if(!stack.isEmpty() && data[0] > arr[i]){
                list.add(i - data[1]);
            }

            stack.push(new int[]{arr[i],i});

        }
      return list;
    }

    public static void main(String[] args) {

        int[] arr={100,80,60,70,60,75,85};
        int size=arr.length;

        List<Integer> output=stockSpare(arr,size);
        System.out.println(output);

    }
}
