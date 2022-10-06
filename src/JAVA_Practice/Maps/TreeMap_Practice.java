package JAVA_Practice.Maps;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Practice {


    public static void main(String[] args) {

        TreeMap<Student,String> treeMap=new TreeMap<>(new compareByMarks());//here user defined object is inserted as
                                                                          //key that why we used comparator class.

        treeMap.put(new Student(1,"shivraj",720),"Maharashtra");
        treeMap.put(new Student(3,"rohit",690),"karnataka");
        treeMap.put(new Student(2,"swapnil",720),"delhi");
        treeMap.put(new Student(4,"ashok",880),"mp");


        Set<Map.Entry<Student,String>> set=treeMap.entrySet();

        for(Map.Entry<Student,String> entry:set){

            System.out.println(entry.getValue());

            Student student=entry.getKey();

            System.out.println(student);

        }

    }
}

class compareByMarks implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {

        return o1.getMarks()>o2.getMarks()?1:-1;
    }
}
