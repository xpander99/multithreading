package jmm_basics.tortoise_hare;

public class Main {
    public static void main(String[] args){
        TortoiseRunnable tortoiseRunnable = new TortoiseRunnable();
        HareRunnable hareRunnable = new HareRunnable();
        Thread t1 = new Thread(tortoiseRunnable,"Tortoise");
        Thread t2 = new Thread(hareRunnable,"Hare");
        t1.start();
        t2.start();
    }
}
