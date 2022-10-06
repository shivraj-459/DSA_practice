package JAVA_Practice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {


    public static void main(String[] args) {

       // Queue<Student> queue=new PriorityQueue<>();//compare by marks cause student implements comparable interface
        Queue<Student> queue=new PriorityQueue<>(new CompareByRoll());//uses custom compare by roll class which implements Comparator interface

          queue.add(new Student(2,"shivraj",750));
          queue.add(new Student(1,"rohit",690));
          queue.add(new Student(4,"swapnil",665));
          queue.add(new Student(3,"ashok",795));


          while(!queue.isEmpty()) {
              System.out.println(queue.poll());
          }

    }
}



 class CompareByRoll implements Comparator<Student>{


     @Override
     public int compare(Student o1, Student o2) {

         return o1.getRoll() > o2.getRoll()?1:-1;
     }
 }
