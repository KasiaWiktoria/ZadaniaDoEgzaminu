import java.util.*;
public class Obecni implements Iterable<Osoba>{
    private ArrayList<Osoba> listaOsob;

    public Obecni(){
        listaOsob = new ArrayList<>();
    }

    public void dodajOsobe(Osoba x){
        this.listaOsob.add(x);
    }
    public void  usunOsobe(Osoba x){
        this.listaOsob.remove(x);
    }

    @Override
    public Iterator<Osoba> iterator(){
        return new Iterator<Osoba>(){
          private int it = 0;

          @Override
            public boolean hasNext(){
              return it < ileOsob()-1;
          }
          @Override
            public Osoba next(){
              return listaOsob.get(++it);
          }
        };
    }

    public int ileOsob(){
        return this.listaOsob.size();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        while(iterator().hasNext()){
            sb.append(iterator().next().toString()).append(" ");
        }
        return sb.toString();
    }

    public static void main(String [] args){
        Osoba a = new Osoba("Anna", "Nowak");
        Osoba b = new Osoba("Jan", "Banasiak");
        Osoba c = new Osoba("Kamil", "Kowalski");
        Osoba d = new Osoba("Ela", "Koc");

        Obecni o = new Obecni();
        o.dodajOsobe(a);
        o.dodajOsobe(b);
        o.dodajOsobe(c);
        o.dodajOsobe(d);

        System.out.print(o.toString());

    }
}
