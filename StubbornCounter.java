/*
Proszę napisać klasę StubbornCounter reprezentującą ,,nieskończony” wątek. Obiekt
tej klasy powinien zawierać wewnętrzny licznik, który startuje od zera i jest
inkrementowany co zadany interwał czasowy (proszę użyć metody sleep). Proszę
wyposażyć klasę w metodę pozwalającą odczytać bieżącą wartość licznika. Przerwanie
wątku (wywołanie jego metody interupt) powinno skutkować wyzerowaniem licznika
i rozpoczęciem inkrementacji na nowo.
 */

public class StubbornCounter extends Thread {
    private int licznik;

    @Override
    public void run(){
        while (true) {
            licznik++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                licznik = 0;
            }
        }
    }

    public int getLicznik() {
        return licznik;
    }
}
