/*
Proszę napisać klasę Kontakt – opisującą kontakt w książce telefonicznej. Klasa powinna
zawierać pola: imię, nazwisko, lista numerów oraz następujące metody: konstruktor,
dodawanie/usuwanie numeru, toString, equals. Klasa powinna implementować interfejs
Comparable<Kontakt> w celu umożliwienia alfabetycznego sortowania kontaktów.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kontakt implements  Comparable<Kontakt>{

    private String imie;
    private String nazwisko;
    private List<Integer> numery;

    public Kontakt(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numery = new ArrayList<>();
    }

    public void  dodajNumer(int numer){
        this.numery.add(numer);
    }
    public void  usunNumer(int numer){
        this.numery.remove(numer);
    }

    @Override
    public String toString(){
        return imie + ' ' + nazwisko ;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Kontakt))
            return false;
        Kontakt k = (Kontakt) o;

        int licznik = 0;
        if( imie == k.imie && nazwisko == k.nazwisko)
            for (int i = 0; i <numery.size() ; i++) {
                if(numery.get(i) == k.numery.get(i));
                licznik++;
            }
        if(licznik == numery.size())
            return  true;

        return false;
    }

    @Override
    public int compareTo(Kontakt ko) {

        Kontakt k = (Kontakt) ko;
        int cs = nazwisko.compareTo(k.nazwisko);
        if(cs == 0) {
            if (imie.compareTo(k.imie) == 0)
            for (int i = 0; i < numery.size(); i++) {
                if(numery.get(i) == k.numery.get(i));
            }
            return  0;
        }else
            return cs;
    }
}
