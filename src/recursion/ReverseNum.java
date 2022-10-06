package recursion;

import java.util.Scanner;

public class ReverseNum {

    static int sum=0;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int output= input.nextInt();

        Reverse(output);

        System.out.println(sum);
    }

    public static void Reverse(int N){

        if(N==0){
            return;
        }

        int rem=N%10;

       sum=sum*10+rem;

         Reverse(N/10);
    }
}
