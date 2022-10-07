package Stacks;

public class RainWaterTrapping {

    public static int totalTrapped(int[] arr,int size){

        int[] maxL=new int[size];
        int[] maxR=new int[size];

        maxL[0]=arr[0];

        for(int i=1;i<size;i++){

            maxL[i]=Math.max(maxL[i-1],arr[i]);
        }

        maxR[size-1]=arr[size-1];

        for(int j=size-2;j>=0;j--){

            maxR[j]=Math.max(maxR[j+1],arr[j]);

        }

        int[] water=new int[size];

        for(int i=0;i<size;i++){
            water[i]=Math.min(maxL[i],maxR[i]) - arr[i];
        }

        int sum=0;

        for(int i=0;i<size;i++){
           sum+=water[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};

        int size=arr.length;

        int output=totalTrapped(arr,size);
        System.out.println(output);


    }
}
