package E2014;

import java.util.*;

public class Feeder extends Thread {
    private Set<Double> random;
    private long interval;

    public Feeder(Set<Double> set, long interval) {
        this.random = set;
        this.interval = interval;
    }

    @Override
    public void run() {
        Random generator = new Random();
        try {
            while (true) {
                Thread.sleep(interval);
                random.add(generator.nextDouble() % 2);
            }
        } catch (InterruptedException e) {
            System.out.print("Przerwano wątek \n");
        }
    }

    public static void main(String[] args) {

        Set<Double> s = new TreeSet<>();
        Feeder t = new Feeder(s, 100);
        t.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.print("tsfdc");
        }
        Iterator<Double> iterator = t.random.iterator();
        while (iterator.hasNext())
            System.out.print("wartość: " + iterator.next() + "\n");

        t.interrupt();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.print("tsfdc");
        }
        iterator = t.random.iterator();
        while (iterator.hasNext())
            System.out.print("wartość: " + iterator.next() + "\n");
    }
}
