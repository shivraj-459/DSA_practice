package SlidingWindow.fixedSize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurrencesOfAnagram {

    public static void main(String[] args) {

        String s="cbaebabacd";
        String p="abc";

        List<Integer> list=findOccurrenceIndex(s,p);
        System.out.println(list);
    }

     static List<Integer> findOccurrenceIndex(String s, String p){

        int size=s.length();
        int k=p.length();

        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<k;i++){

            char ch=p.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }
            else{
                map.put(ch , 1);
            }
        }


        int count=map.size();

        int start=0;
        int end=0;
        List<Integer> list=new ArrayList<>();

        while(end<size){

            char ch=s.charAt(end);

            if(map.containsKey(ch)){

                map.put(ch,map.get(ch)-1);

                if(map.get(ch)==0){
                    count--;
                }

            }

            if((end-start+1)<k){
                end++;
            }

            else if((end-start+1)==k){

                if(count==0){
                    list.add(start);
                }

                if(map.containsKey(s.charAt(start))){

                    map.put(s.charAt(start),map.get(s.charAt(start)) + 1);

                    if(map.get(s.charAt(start))==1){
                        count++;
                    }
                }
                start++;
                end++;

            }
        }
        return list;
     }
}
