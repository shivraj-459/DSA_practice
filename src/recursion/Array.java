package recursion;

import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,10,8,9,2,20};
        System.out.println(FindSorted(arr,0));

        int target=2;
//        System.out.println(checknum(arr,target,0));
//
//        System.out.println(findindex(arr,target,0));
//
//        System.out.println(findindexrev(arr,target,arr.length-1));
//
//        findindexarray(arr,target,0);
//
//        System.out.println(list);
//
//
//
//       ArrayList<Integer> list1=returnfindindexarray(arr,target,0,new ArrayList<>());
//        System.out.println(list1);


        //System.out.println(findIndexof(arr,target,0));
    }

    static boolean FindSorted(int[] arr,int index){

        if(index==arr.length-1){
            return true;
        }

        return (arr[index]<arr[index+1] && FindSorted(arr,index+1));
    }


    static boolean checknum(int[] arr,int target,int index){

        if(index==arr.length){
            return false;
        }

        return (arr[index]==target || checknum(arr,target,index+1));
    }


    static int findindex(int[] arr,int target,int index){

        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findindex(arr,target,index+1);
        }
    }


    static int findindexrev(int[] arr,int target,int index){

        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findindexrev(arr,target,index-1);
        }
    }


    static ArrayList<Integer> list=new ArrayList<>();

    static void findindexarray(int[] arr,int target,int index){

        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }

            findindexarray(arr,target,index+1);

    }


    static ArrayList<Integer> returnfindindexarray(int[] arr,int target,int index,ArrayList<Integer> list){

        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

       return returnfindindexarray(arr,target,index+1,list);

    }

//below approach is not a good approach because we are creating list inside function so for every function call new list will be created.
    static ArrayList<Integer> findIndexof(int[] arr,int target,int index){

        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> ansfrombottom= findIndexof(arr,target,index+1);

        list.addAll(ansfrombottom);

        return list;

    }


}
