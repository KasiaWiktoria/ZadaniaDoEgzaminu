/*
Proszę napisać klasę Gracz opisującą graczy w grze komputerowej. Każdy gracz
ma przypisany unikalny pseudonim (String) i liczbę zdobytych punktów (int – którą można
odczytywać, zwiększać i zmniejszać). Graczy można rejestrować (tworzyć) i
wyrejestrowywać (usuwać). Klasa ma kontrolować liczbę zarejestrowanych graczy: w
programie może istnieć nie więcej niż 6 obiektów typu Gracz.

Jaki wzorzec projektowy wykorzystuje się przy tworzeniu tej klasy? ----tego nie wiem
*/

public class Gracz {

    private String pseudonim;
    private int punkty;
    private static int liczbaGraczy = 0;

    public Gracz(String pseudonim){
        if(liczbaGraczy >= 6)
            throw new IllegalStateException("Istnieje już 6 graczy. Nie można stworzyć więcej!");
        this.pseudonim = pseudonim;
        this.punkty = 0;
        liczbaGraczy++;
    }

    public void dodajPunkty(int ilePkt){ this.punkty+=ilePkt; }
    public int getPunkty(){return punkty;}
    public String getPseudonim(){ return  pseudonim;}
    public void setPseudonim(String nowyPseudonim){ this.pseudonim = nowyPseudonim;};


    public static void main(String[] args){

        Gracz g = new Gracz("nowyGracz");

        g.dodajPunkty(25);
        System.out.print("Liczba punktów gracza: " + g.getPunkty() + "\n");
        g.dodajPunkty(-7);
        System.out.print("Liczba punktów gracza: " + g.getPunkty());
    }
}

