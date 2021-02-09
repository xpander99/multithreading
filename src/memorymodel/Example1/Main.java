package memorymodel.Example1;

public class Main {
    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable2);
        t1.start();
        t2.start();
    }
}
