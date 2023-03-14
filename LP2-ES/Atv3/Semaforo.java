public class Semaforo {
    private int recursos;

    public Semaforo(int recursos) {
        this.recursos = recursos;
    }

    public synchronized void adquirir() throws InterruptedException {
        while (recursos == 0) {
            wait();
        }
        recursos--;
    }

    public synchronized void liberar() {
        recursos++;
        notifyAll();
    }
}
