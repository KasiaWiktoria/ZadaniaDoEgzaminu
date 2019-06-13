/*
Proszę napisać klasę Gambler, zawierającą pole tekstowe (pseudonim) i dwa pola
numeryczne (całkowite: maksymalną liczbę punktów kiedykolwiek zdobytą i aktualną
liczbę punktów). Klasa Gambler dziedziczy bezpośrednio po klasie Object
i implementuje interfejs Comparable<Gambler> (metoda compareTo ma umożliwiać
uporządkowanie listy graczy według maksymalnej liczby punktów (i tylko niej)). W klasie
Gambler należy przesłonić metody equals, hashCode i toString (dziedziczone po
klasie Object) oraz zdefiniować przynajmniej jeden konstruktor (ze stosownymi
argumentami) i metody dostępowe. Proszę założyć, że bazą metod equals i hashCode
jest pseudonim (który jest unikalny i jednoznacznie identyfikuje obiekt klasy Gambler).
 */

public class Gambler extends  Object implements Comparable<Gambler>{
    private String pseudonim;
    private double punkty;
    private double rekord;
    private  static String[] gamblers;

    public Gambler(String pseudonim) {
        for (int i = 0; i < gamblers.length; i++) {
            if (gamblers[i] == pseudonim)
                throw new IllegalArgumentException("gracz o podanym pseudonimie już istnieje");
        }
        this.pseudonim = pseudonim;
        this.punkty = 0;
        this.rekord = 0;
    }

    @Override
    public int compareTo(Gambler o) {
            return (int)(this.punkty - o.punkty);
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Gambler))
            return false;
        else {
            Gambler g = (Gambler) o;
            return this.pseudonim.equals(g.pseudonim) && this.punkty == g.punkty && this.rekord == g.rekord;
        }
    }

    @Override
    public int hashCode(){
        return pseudonim.hashCode();
    }

    @Override
    public String toString(){
        return pseudonim;
    }



    public String getPseudonim() {
        return pseudonim;}
    public void setPseudonim(String pseudonim) {
        this.pseudonim = pseudonim; }
    public double getPunkty() {
        return punkty; }
    public void setPunkty(double punkty) {
        this.punkty = punkty; }
    public double getRekord() {
        return rekord; }
    public void setRekord(double rekord) {
        this.rekord = rekord; }
    public static String[] getGamblers() {
        return gamblers; }
    public static void setGamblers(String[] gamblers) { Gambler.gamblers = gamblers; }
}
