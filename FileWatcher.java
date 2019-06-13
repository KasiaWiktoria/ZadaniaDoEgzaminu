/*
Proszę napisać klasę FileWatcher – jej obiekt to wątek, który działając w tle ,,bez
końca” sprawdza w określonych odstępach czasu, czy pojawił się określony plik, który
można czytać. Po stwierdzeniu, że plik istnieje – zapala publiczną flagę, którą można
sprawdzić z innej klasy. Do sprawdzenia, czy plik można czytać służy metoda canRead()
z klasy java.io.File. Konstruktor obiektu File przyjmuje jako argument napis –
ścieżkę pliku.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileWatcher {

    private Thread watek;
    public boolean czyMoznaCzytac;
    private String sciezka;


    public FileWatcher(String sciezka){
        this.sciezka = sciezka;
        czyMoznaCzytac = false;

    }

    public void canRead() throws FileNotFoundException {
        try {
            BufferedReader in = new BufferedReader(new FileReader(sciezka));
                czyMoznaCzytac = true;
        }catch(FileNotFoundException e){
            czyMoznaCzytac = false;
        }
    }
}
