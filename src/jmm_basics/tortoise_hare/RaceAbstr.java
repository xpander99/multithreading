package jmm_basics.tortoise_hare;

public abstract class RaceAbstr implements Runnable{

    protected final int TOTAL_DISTANCE = 100;
    protected SingletonStatus status;
    protected boolean isSleeping;

    public RaceAbstr() {
        this.status = SingletonStatus.getSingletonStatus();
    }

    public boolean checkIfFinished(int distanceCovered) {
        return distanceCovered == TOTAL_DISTANCE;
    }

    public void run(){
        for (int i = 1; i <= TOTAL_DISTANCE; i++) {
            int distanceCovered = i;
            if(isSleeping){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (status.getWon()) {
                status.printWinner();
                break;
            }
            if (checkIfFinished(distanceCovered)) {
                status.setWon();
                status.setWinner(Thread.currentThread().getName());
            }
        }
    }
}
