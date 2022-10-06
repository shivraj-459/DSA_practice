package BinarySearch;

public class OrderAgnosticBs {


    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,14,20,36,48};

        int target=41;

        boolean output=orderAgnostic(arr,target);

        System.out.println(output);

    }

    static boolean orderAgnostic(int[] arr,int target){

        int s=0;
        int e=arr.length-1;

        boolean isAsc= arr[0] < arr[e];


        while(s<=e){

            int m=s + (e-s)/2;

            if(arr[m]==target){

                return true;
            }

            if(isAsc){

                if(arr[m]>target){

                    e=m-1;
                }

                else{
                    s=m+1;
                }
            }

            else{

                if(arr[m]<target){

                    e=m-1;
                }

                else{
                    s=m+1;
                }

            }

        }

           return false;
    }
}
