package BinarySearch;

public class NumberOfRotations {

    public static void main(String[] args) {

        int[] arr={3 ,4, 7, 9, 1, 2};

        int output=pivot(arr);

        System.out.println(output+1);

    }

    static int pivot(int[] arr){

        int s=0;
        int e=arr.length-1;

        while(s<=e){

            int m= s + (e-s)/2;

            if(m<e && arr[m]>arr[m+1]){
                return m;
            }

            if(m>s && arr[m]<arr[m-1]){

                return m-1;
            }

            if(arr[m]==arr[s] && arr[m]==arr[e]){

                if(arr[s]>arr[s+1]){

                    return s;
                }

                s++;

                if(arr[e]<arr[e-1]){
                    return e-1;
                }

                e--;
            }

            else if(arr[s]<arr[m] || (arr[s]==arr[m] && arr[m]>arr[e])){

                s=m+1;
            }

            else{
                e=m-1;
            }

        }

        return -1;
    }
}
