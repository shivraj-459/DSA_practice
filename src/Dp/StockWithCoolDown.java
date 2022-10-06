package Dp;

public class StockWithCoolDown {

     static int[][] dp;

     public static int stockWithCoolDown(int[] price,int index,int state,int N){

         if(index>=N){
             return 0;
         }

         if(dp[index][state]!=-1){

             return dp[index][state];
         }

         int res;

         if(state==1){

             int buy=stockWithCoolDown(price, index+1,0, N) - price[index];
             int notBuy=stockWithCoolDown(price, index+1, 1, N);

             res=Math.max(buy,notBuy);
         }

         else {

             int sell=stockWithCoolDown(price, index+2, 1, N) + price[index];
             int notSell=stockWithCoolDown(price, index+1, 0, N);

             res=Math.max(sell,notSell);
         }

         dp[index][state]=res;

         return dp[index][state];

     }

    public static void main(String[] args) {

        int[] price={1,2,3,0,2};

        int N=price.length;


        dp=new int[N][2];

        for(int i=0;i<dp.length;i++){

            for(int j=0;j<dp[0].length;j++){

                dp[i][j]=-1;
            }
        }

        int output=stockWithCoolDown(price,0,1,N);

//        for(int i=0;i<dp.length;i++){
//
//            System.out.println(Arrays.toString(dp[i]));
//        }

        System.out.println(output);


    }
}
