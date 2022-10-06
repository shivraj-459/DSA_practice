package Queues;

public class QueueImpl {


    static class Queue{

        static int[] arr;
        static int size;

        static int rear=-1;

        public Queue(int n){

            arr=new int[n];
            this.size=n;

        }

        public static boolean isEmpty(){

            return rear==-1;
        }

        //Enqueue
        public static void add(int data){

            if(rear==size-1){

                System.out.println("queue is full");
                return;
            }

            rear++;
            arr[rear]=data;
        }

        //Dequeue
        public static int remove(){ // it will take TC as O(N)

            if(isEmpty()){

                System.out.println("queue is empty");
                return -1;
            }
            int front=arr[0];

            for(int i=0;i<rear;i++){

                arr[i]=arr[i+1];
            }
              rear--;
            return front;
        }

        public static int peek(){ // takes TC O(N)

            if(isEmpty()){

                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {


        Queue queue=new Queue(4);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);


        while(!queue.isEmpty()){

            System.out.println(queue.peek());
            queue.remove();
        }

    }
}
