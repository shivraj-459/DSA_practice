package Dp;

import java.util.Arrays;

public class ZeroOneKnapsack {

    static int[][] dp;

    public static int knapSack(int[] wt,int[] profit,int W,int index){

        if(index==0 || W==0){

           // return 0;
            dp[index][W]=0;
            return dp[index][W];
        }

        if(dp[index][W]!=-1){

            return dp[index][W];

        }

        if(wt[index-1]>W){

            dp[index][W] = knapSack(wt, profit, W, index-1);
        }

        else{


            int include=knapSack(wt, profit, W-wt[index-1], index-1) + profit[index-1];
            int exclude=knapSack(wt, profit, W, index-1);

            int res= Math.max(include,exclude);

            dp[index][W]=res;

        }
        return dp[index][W];
    }

    public static void main(String[] args) {


            int[] wt={1,3,4,8};
            int[] profit={1,4,5,7};


            int index=wt.length;
            int W=7;

            dp=new int[index+1][W+1];

            for(int i=0;i<dp.length;i++){

                for(int j=0;j<dp[0].length;j++){

                    dp[i][j]=-1;
                }
            }



           int output= knapSack(wt,profit,W,index);


            for(int i=0;i<dp.length;i++){

                System.out.println(Arrays.toString(dp[i]));
            }

        System.out.println(output);

    }
}
