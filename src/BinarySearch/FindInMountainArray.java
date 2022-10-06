package BinarySearch;

public class FindInMountainArray {



    public static void main(String[] args) {

       int[] arr={1,2,5,6,7,8,6,5,4,3,2};
       int target=3;

       int output=findInMountainArray(target,arr);
        System.out.println(output);

    }

    static int findInMountainArray(int target, int[] mountainArr) {

        int s=0;
        int e=mountainArr.length-1;

        while(s<e){

            int m= s+(e-s)/2;

            if(mountainArr[m]>mountainArr[m+1]){

                e=m;
            }

            else if(mountainArr[m]<mountainArr[m+1]){

                s=m+1;
            }
        }

        int peak=s;

        int left=binarySearch(mountainArr,target,0,peak);

        if(left==-1){

            return binarySearch(mountainArr,target,peak+1,mountainArr.length-1);
        }

        else{
            return left;
        }


    }

    static int binarySearch(int[] arr,int target,int start,int end){

        boolean isAsc= arr[start] < arr[end];

        while(start<=end){

            int m=start + (end-start)/2;

            if(arr[m]==target){

                return m;
            }

            if(isAsc){

                if(arr[m]>target){
                    end=m-1;
                }

                else{
                    start=m+1;
                }
            }

            else{
                if(arr[m]<target){
                    end=m-1;
                }

                else{
                    start=m+1;
                }
            }
        }

        return -1;
    }
}
