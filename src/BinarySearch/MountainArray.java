package BinarySearch;

public class MountainArray {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,7,6,3,2};

        int output=findLargest(arr);
        System.out.println(output);


    }

    static int findLargest(int[] arr){

        int s=0;
        int e=arr.length-1;

        while(s<e){

            int m=s + (e-s)/2;

            if(arr[m]>arr[m+1]){

                e=m;
            }

            else if(arr[m]<=arr[m+1]){
                s=m+1;
            }
        }

        return s;

    }
}
