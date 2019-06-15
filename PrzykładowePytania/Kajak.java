import java.util.*;

public class Kajak implements Comparable<Kajak>, Iterable<Kajak> {
    private String nazwa;
    private int rokZakupu;
    private double dlugosc;
    private ArrayList<Kajak> listaKajakow;

    public Kajak(String nazwa, int rokZakupu, double dlugosc) {
        this.nazwa = nazwa;
        this.rokZakupu = rokZakupu;
        this.dlugosc = dlugosc;
    }

    @Override
    public int compareTo(Kajak k){
        if(this.dlugosc<k.dlugosc)
            return -1;
        else if(this.dlugosc==k.dlugosc)
            return 0;
        else
            return 1;
    }

    @Override
    public int hashCode(){
        return Objects.hash(nazwa,rokZakupu,dlugosc);
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Kajak && this.nazwa ==((Kajak)o).nazwa && this.rokZakupu == ((Kajak)o).rokZakupu;
    }

    @Override
    public String toString(){
        return nazwa + " rok zakupu: " + rokZakupu + " dlugosc: " + dlugosc;
    }

    @Override
    public Iterator<Kajak> iterator(){
        return new Iterator<Kajak>(){
            int it =0;

            @Override
            public boolean hasNext(){
                return it < listaKajakow.size();
            }
            @Override
            public Kajak next(){
                return listaKajakow.get(it++);
            }
        };
    }
}
