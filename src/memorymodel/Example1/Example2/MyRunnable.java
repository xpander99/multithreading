package memorymodel.Example1.Example2;

public class MyRunnable implements Runnable{
    private int count;
    public void run(){
        for(int i = 0;i<1_000_000;i++){
            this.count++;
        }
        System.out.println(Thread.currentThread().getName() + " " + this.count);
    }
}
