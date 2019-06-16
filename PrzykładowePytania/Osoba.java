public class Osoba {
    private String imie;
    private String nazwisko;

    public String getImie() { return imie; }
    public String getNazwisko() { return nazwisko; }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString(){
        return imie + " " + nazwisko;
    }
}
