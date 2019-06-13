/*
Proszę napisać klasę Towar, zawierającą pole tekstowe (unikalna nazwa) i dwa
pola numeryczne (cena – liczba całkowita i waga – liczba rzeczywista). Klasa Towar
dziedziczy bezpośrednio po klasie Object i implementuje interfejs
Comparable<Towar> (metoda compareTo ma umożliwiać alfabetyczne posortowanie
towarów). W klasie Towar należy rozsądnie przesłonić metody equals, hashCode i
toString (dziedziczone po klasie Object) oraz zdefiniować przynajmniej jeden
konstruktor (ze stosownymi argumentami) i metody dostępowe.
 */


package E2014;
import java.util.*;

public class Towar implements Comparable<Towar> {

    private String nazwa;
    private int cena;
    private double waga;

    public Towar(String nazwa, int cena, double waga){
        this.cena = cena;
        this.nazwa = nazwa;
        this.waga = waga;
    }

    public String getNazwa(){ return nazwa; }
    public int getCena(){ return cena;}
    public  double getWaga() {return waga;}
    public void setNazwa(String nazwa) { this.nazwa = nazwa; }
    public void setCena(int cena) { this.cena = cena; }
    public void setWaga(double waga) { this.waga = waga; }

    @Override
    public int hashCode(){
        return 41*Objects.hashCode(cena)+17*Objects.hashCode(waga)+19*Objects.hashCode(nazwa);
    }

    @Override
    public boolean equals(Object o){
        Towar t = (Towar) o;

        return t instanceof Towar && nazwa.equals(t.nazwa) && cena == t.cena && waga == t.waga;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(nazwa).append(cena).append(waga);
        return sb.toString();
    }

    @Override
    public int compareTo(Towar o) {
        //int result = getCena() - o.getCena();
        int result = getNazwa().compareTo(o.getNazwa());
        return result;
    }
}
