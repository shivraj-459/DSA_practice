package BinarySearch;

public class FindTarget {

     static boolean findRecursively(int[] arr,int s,int e,int target){


        if(s>e){

            return false;

        }

        int m=s + (e-s)/2;


        if(arr[m]==target){

            return true;
        }

        if(arr[m]>target) {
            return findRecursively(arr, s, m - 1, target);
        }
        else {
            return findRecursively(arr, m + 1, e, target);
        }


    }


     static boolean findByIteration(int[] arr,int s,int e,int target){

        boolean ans=false;

        while(s<=e){

            int m=s + (e-s)/2;

            if(arr[m]==target){

                ans=true;
                break;

            } else if (arr[m]>target) {

                e=m-1;
            }

            else{
                s=m+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr={2,4,6,9,11,12,14,20,36,48};

        int s=0;
        int e=arr.length-1;
        int target=21;

        boolean output= findRecursively(arr,s,e,target);

        boolean output1=findByIteration(arr,s,e,target);
        System.out.println(output);
    }
}
