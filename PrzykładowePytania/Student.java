import java.util.*;

public class Student {
    private String imie;
    private String nazwisko;
    private int nrAlbumu;
    private Map<String,Double> listaOcen;

    public Student(String imie, String nazwisko, int nrAlbumu){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrAlbumu = nrAlbumu;
        listaOcen = new HashMap<>();
    }

    public void dodajOcene(String data, double ocena){
        if (ocena != 2 && ocena != 2.5 && ocena != 3 && ocena != 3.5 && ocena != 4 && ocena != 4.5 && ocena != 5 )
            throw new IllegalArgumentException("Próbujesz wpisać ocenę poza skalą");

        listaOcen.put(data, ocena);
    }

    @Override
    public int hashCode(){
        return nrAlbumu;
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Student && this.nrAlbumu == ((Student)o).nrAlbumu;
    }

    @Override
    public String toString(){
        return imie + " " + nazwisko;
    }

    public double najlepszaOcena(){
        return Collections.max(listaOcen.values());
        /*
        //Ewentualnie:
        double max = 0;
        for (double ocena : listaOcen.values()) {
            if(ocena > max)
                max = ocena;
        }
        return max;
        */
    }
}
