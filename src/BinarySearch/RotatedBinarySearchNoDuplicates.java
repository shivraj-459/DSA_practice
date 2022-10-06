package BinarySearch;

public class RotatedBinarySearchNoDuplicates {

    public static void main(String[] args) {

        int[] arr={4,5,6,7,0,1,2};
        int target=0;

        int output=search(arr,target);
        System.out.println(output);

    }

    static int search(int[] arr,int target){

        int pivot=findPivot(arr);

        if(pivot==-1){

            return binarySearch(arr,target,0,arr.length-1);
        }


        if(arr[pivot]==target){

            return pivot;
        }

        if(target >= arr[0]){

            return binarySearch(arr,target,0,pivot-1);
        }

        else {

            return binarySearch(arr,target,pivot+1,arr.length-1);
        }
    }


    static int binarySearch(int[] arr,int target,int s,int e){

        while(s<=e){
            int m=s + (e-s)/2;

            if(arr[m]==target){

                return m;
            }

            else if(arr[m]>target){

                e=m-1;
            }

            else{

                s=m+1;
            }

        }

        return -1;

    }

    static int findPivot(int[] arr){

        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int m=start + (end-start)/2;

            if(m<end && arr[m]>arr[m+1]){

                return m;
            }

            if(m>start && arr[m]<arr[m-1]){

                return m-1;
            }

            if(arr[start]>=arr[m]){

                end=m-1;

            }

            else {

                start =m+1;
            }
        }

        return -1;

    }
}
