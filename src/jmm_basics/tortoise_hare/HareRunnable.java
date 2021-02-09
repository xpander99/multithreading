package jmm_basics.tortoise_hare;

public class HareRunnable extends RaceAbstr implements Runnable {
    public HareRunnable(){
        this.isSleeping = true;
    }
}
