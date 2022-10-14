package SlidingWindow.variableSize;

import java.util.HashMap;
import java.util.Map;

public class PickToys {

    public static void main(String[] args) {

        String str="abaccab";
        int type=2;

        int output=totalToys(str,type);
        System.out.println(output);
    }

    static int totalToys(String str,int type){

        int s=0;
        int e=0;
        int size=str.length();
        int max=0;
        Map<Character,Integer> map=new HashMap<>();

        while(e<size){

            char ch=str.charAt(e);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

            if(map.size()==type){
                max=Math.max(max,(e-s+1));
            }
            else if(map.size()>type){

                while (map.size()>type){

                    map.put(str.charAt(s),map.get(str.charAt(s))-1);
                    if(map.get(str.charAt(s))==0){
                        map.remove(str.charAt(s));
                    }
                    s++;
                }
            }
            e++;
        }
        return max;
    }
}
