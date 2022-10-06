package JAVA_Practice.Maps;

import java.util.*;

public class Hashtable_Practice {

    public static void main(String[] args) {


        Hashtable<Integer,String> table=new Hashtable<Integer,String>();

        table.put(5,"mumbai");
        table.put(2,"pune");
        table.put(1,"delhi");
        table.put(4,"ranchi");
        table.put(3,"kolkata");

        Set<Map.Entry<Integer,String>> set=table.entrySet();

        for(Map.Entry<Integer,String> entry:set){

            System.out.println("key : " + entry.getKey());
            System.out.println("value : " + entry.getValue());

        }


        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>(table); //for sorting of hashtable using treemap

        Set<Integer> keys=treeMap.keySet();
        Iterator<Integer> itr= keys.iterator();

        while (itr.hasNext()){

            Integer i= itr.next();

            System.out.println(i+" "+ treeMap.get(i));
        }
    }
}
