public class PersistentCounter extends Thread {
    private volatile long counter = 0;
    private long interval;

    public PersistentCounter(long counter, long interval){
        this.counter = counter;
        this.interval = interval;
    }

    @Override
    public void run(){
        try{
            while(true) {
                Thread.sleep((int)interval);
                this.counter++;
            }
        }catch (InterruptedException e){
            this.counter = 0;
        }
    }

    public long getCounter(){
        return counter;
    }
}
