/*
Proszę napisać klasę FileWatcher – jej obiekt to wątek, który działając w tle ,,bez
końca” sprawdza w określonych odstępach czasu, czy pojawił się określony plik, który
można czytać. Po stwierdzeniu, że plik istnieje – zapala publiczną flagę, którą można
sprawdzić z innej klasy. Do sprawdzenia, czy plik można czytać służy metoda canRead()
z klasy java.io.File. Konstruktor obiektu File przyjmuje jako argument napis –
ścieżkę pliku.
 */

import java.io.File;
import java.io.FileNotFoundException;

public class FileWatcher extends Thread {

    public boolean czyMoznaCzytac;
    private String sciezka;
    private long interval;

    public FileWatcher(String sciezka, long interval) {
        this.sciezka = sciezka;
        czyMoznaCzytac = false;
        this.interval = interval;
    }

    @Override
    public void run() {
        try {
            File file = new File(sciezka);
            while (czyMoznaCzytac == false) {
                Thread.sleep((int) interval);
                if (file.canRead()) {
                    this.czyMoznaCzytac = true;
                    System.out.println("Można czytać\n");
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Przerwano wątek");
        }
    }

    /*  --------------Test-----------------
    public static void main(String [] args){
        String path = "/Users/julia/Desktop/test1.txt";
        Thread fw = new FileWatcher(path, 30000);

        fw.start();
    }
    */
}


