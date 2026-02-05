package Package2;

public class MultiThreading1 extends  Thread{
    public static void main(String[] args) {
        Thread thread = new Thread(()-> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello from the 1st thread! " + i  + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("First Thread Completed________________________");
        });




        Thread thread1= new Thread(()-> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello from the 2nd thread! " + i  + " " + Thread.currentThread().getName());

                try {
                    Thread.sleep(600); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Second Thread Completed________________________");

        });


        try {
            thread.start();
            thread1.start();
            System.out.println(thread1.getState());



            thread.join();
            System.out.println("Main Thread Started");
//            System.out.println(Thread.getState());
//
//            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
