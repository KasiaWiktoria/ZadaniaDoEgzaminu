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
        if (ocena != 2 || ocena != 2.5 || ocena != 3|| ocena != 3.5 || ocena != 4 || ocena != 4.5 || ocena != 5 )
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
        double max = 0;
        for (double ocena : listaOcen.values()) {
            if(ocena > max)
                max = ocena;
        }
        return max;
    }

    public static void main(String [] args){

        Student A = new Student("Adam", "Nowak", 123456);
        Random gen = new Random();
        for (int i = 0; i < 9; i++) {
            double o = gen.nextDouble() % 5 + 1;
            System.out.print(o + "\n");
            A.dodajOcene("0" + i + "-06-2019",o);
        }
        System.out.print(A.toString() + " lista ocen: ");
        for(double ocena : A.listaOcen.values()){
            System.out.print( ocena + "\n");
        }
        System.out.print(A.listaOcen.values());
    }

}
