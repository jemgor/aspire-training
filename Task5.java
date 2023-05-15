package aspire.internship;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        //check the middle number/s in a pqueue whether length is even or odd
        //we add the element to the higher, if lower.size() < higher.size() - 2 = break
        //higher من الاصغر للاكبر so we remove the top to the lower
        //lower من الاكبر للاصغر and it's ordered on that base

        PriorityQueue<Integer> higher=
                new PriorityQueue<>(Integer::compareTo);
        PriorityQueue<Integer> lower=
                new PriorityQueue<>(Comparator.<Integer>comparingInt(a->a).reversed());

        int preferredSize=9;
        //adds random numbers to the queue
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random();
        IntConsumer addNumberToQueue = queue::add;
        for (int i = 0; i < preferredSize; i++) {
            addNumberToQueue.add(random.nextInt(100));
        }
        int queueSize = queue.size();
        System.out.println("queue.stream().toList() = " + queue.stream().toList());

//!queue.isEmpty
        for (int i =0; i< queueSize; i++){
            if(queueSize%2==0 && !queue.isEmpty()){
                higher.add(queue.poll());
                if (lower.size() <= higher.size() - 2) {
                    lower.add(higher.poll());
                }
            } else if (queueSize%2!=0 && !queue.isEmpty()) {
                higher.add(queue.poll());
                if (lower.size() <= higher.size() - 2) {
                    lower.add(higher.poll());
                }
            }
        }
        System.out.println("higher: " + higher.stream().toList()+ "\nlower: " + lower.stream().toList());
        if(queueSize%2==0){
            System.out.println("middle number is: " + higher.peek());
        }
        else{
            System.out.println("middle number/s are: " + higher.peek() + ", " + lower.peek());
        }
        //System.out.println("middle number/s are: " + higher.peek() + ", " + lower.peek());

    }

    interface IntConsumer {
        void add(int number);
    }
}
