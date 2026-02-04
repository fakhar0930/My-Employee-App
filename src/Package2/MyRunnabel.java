package Package2;

public class MyRunnabel implements Runnable {

    Counter counter;

    MyRunnabel(Counter counter) {
        this.counter = counter;
    }

//    @Override
//    public void run() {
//        for (int i = 1; i <= 2000; i++) {
//            counter.increment();
//        }
//
//    }

    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println(Thread.currentThread().getName() + " Printed: " + i);;
        }

    }



    public static void main(String[] args) {

        Counter counter1 = new Counter();

        MyRunnabel myRunnabel = new MyRunnabel(counter1);
        MyRunnabel myRunnabel1 = new MyRunnabel(counter1);

        //System.out.println("Thread Exmaple");


        Thread t1 = new Thread(myRunnabel, "Thread-1");
        Thread t2 = new Thread(myRunnabel1, "Thread-2");

        t1.start();
        //System.out.println("Line Printed between thread starts");
        t2.start();
        //System.out.println("Line Printed between thread starts");

       try
       {
           t1.join();
           t2.join();
           System.out.println("Thread Example");
       }
         catch (InterruptedException e){
             System.out.println(e);
         }

        System.out.println(counter1.count);


    }



}
class Counter {

    int count = 0;

    public  void increment() {
        count++;
}
}