package SlidingWindow.variableSize;

import java.util.HashMap;
import java.util.Map;

public class minimumWindowSubstring {

    public static void main(String[] args) {

        String str="timetopractice";
        String p="toc";

        int output=findMinimum(str,p);
        System.out.println(output);

    }

   static int findMinimum(String str,String p){

        int s=0;
        int e=0;
        int N=str.length();

       Map<Character,Integer> map=new HashMap<>();

       for(int i=0;i<p.length();i++){

           if(map.containsKey(p.charAt(i))){
               map.put(p.charAt(i),map.get(p.charAt(i))+1);
           }

           else{
               map.put(p.charAt(i),1);
           }
       }
        int min=Integer.MAX_VALUE;
        int count=map.size();

       while(e<N){

           if(map.containsKey(str.charAt(e))){
               map.put(str.charAt(e),map.get(str.charAt(e))-1);

               if(map.get(str.charAt(e))==0){
                   count--;
               }
           }

           if(count>0){
               e++;
           }

           else if(count==0){

              min= Math.min(min,e-s+1);

                   while(count==0){
                       if(map.containsKey(str.charAt(s))) {
                           map.put(str.charAt(s), map.get(str.charAt(s)) + 1);

                           if(map.get(str.charAt(s))>0){
                               count++;
                           }
                       }
                       s++;

                       if(count==0){
                           min= Math.min(min,e-s+1);
                       }
                   }
                   e++;
           }
       }

       return min;
   }
}
