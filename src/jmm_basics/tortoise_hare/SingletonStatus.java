package jmm_basics.tortoise_hare;

public class SingletonStatus {
    private static SingletonStatus singletonStatus;
    private boolean isWon;
    private static String winner;

    private SingletonStatus() {
    }

    public static SingletonStatus getSingletonStatus() {
        if (singletonStatus == null)
            return singletonStatus = new SingletonStatus();
        return singletonStatus;
    }

    public boolean getWon() {
        return this.isWon;
    }

    public void setWinner(String winner) {
        SingletonStatus.winner = winner;
    }

    public void setWon() {
        this.isWon = true;
    }

    public void printWinner() {
        System.out.println("The winner is: " + SingletonStatus.winner);
    }
}
