package Dp.unboundedKnapSack;

import java.util.Arrays;

public class CoinChange {

     static int[][] dp;

     public  static int coinChange(int[] coins,int sum,int N){

         if(sum<=0){
             dp[N][sum]=1;
             return 1;
         }

         if(N==0){
             dp[N][sum]=0;
             return 0;
         }

         if(dp[N][sum]!=-1){

             return dp[N][sum];
         }

         if(coins[N-1]>sum){

             dp[N][sum]=coinChange(coins,sum,N-1);
         }

         else{

             int include=coinChange(coins,sum-coins[N-1],N);

             int exclude=coinChange(coins,sum,N-1);

             dp[N][sum]= include + exclude;
         }

         return dp[N][sum];

     }

    public static void main(String[] args) {

        int[] coins={1,2,3};

        int N=coins.length;
        int sum=5;

        dp=new int[N+1][sum+1];

        for(int i=0;i<dp.length;i++){

            for(int j=0;j<dp[0].length;j++){

                dp[i][j]=-1;
            }
        }

        int output=coinChange(coins,sum,N);

        for(int i=0;i<dp.length;i++){

            System.out.println(Arrays.toString(dp[i]));
        }

        System.out.println("No of ways : "+output);

    }
}
