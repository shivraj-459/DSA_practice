package Dp;

import java.util.Arrays;

public class SubsetSum {

    static boolean[][] dp;

    public static boolean subsetSum(int[] arr,int N,int sum){

        if(sum<=0){

            dp[N][sum]= true;

            return dp[N][sum];
        }

        if(N==0){

            dp[N][sum]= false;
            return dp[N][sum];

        }

        if(dp[N][sum]!=false){

            return dp[N][sum];
        }

        if(arr[N-1]>sum){

            dp[N][sum]=subsetSum(arr,N-1,sum);
        }

        else{

            boolean include=subsetSum(arr,N-1,sum-arr[N-1]);
            boolean exclude=subsetSum(arr, N-1, sum);


            dp[N][sum]= (include || exclude);

        }

           return dp[N][sum];
    }

    public static void main(String[] args) {

        int[] arr={2,3,7,8,10};

        int N=arr.length;
        int sum=11;

        dp=new boolean[N+1][sum+1];

        for(int i=0;i<dp.length;i++){

            for(int j=0;j<dp[0].length;j++){

                dp[i][j]=false;
            }
        }



        boolean output=subsetSum(arr,N,sum);

        for(int i=0;i<dp.length;i++){

            System.out.println(Arrays.toString(dp[i]));
        }

        System.out.println(output);


    }
}
