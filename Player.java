/*
Proszę napisać klasę Plaer, zawierającą pole tekstowe (pseudonim) i dwa pola
numeryczne (całkowite: aktualną liczbę punktów i liczbę pozostałych „żyć”). W klasie
Player należy sensownie przesłonić metody equals, hashCode i toString
(dziedziczone po klasie Object) oraz zdefiniować przynajmniej jeden konstruktor (ze
stosownymi argumentami) i metody dostępowe, realizując następujące wymagania:
1. Pseudonim musi mieć co najmniej 3 znaki i być unikalny (nie mogą istnieć dwa obiekty
o tym samym pseudonimie). Pseudonim jest ustalany przy tworzeniu obiektu i nie może
być później zmieniany.
2. Jednocześnie mogą istnieć co najwyżej 4 obiekty klasy Plaer.
3. Liczba „żyć” jest równa 5 w momencie utworzenia obiektu i może być tylko
zmniejszana.
4. Liczba punktów nie może być zmieniana, gdy liczba „żyć” jest mniejsza, niż 1.
 */

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Player extends  Object{
    private String name;
    private int score;
    private int lifes;
    private static int playersCounter = 0;
    private static Set<String> names = new HashSet<String>();

    public Player(String name){
        if(playersCounter >= 4)
            throw new IllegalStateException("Istnieje już 4 graczy, nie można stworzyć więcej");
        if(name.length() < 3)
            throw new IllegalArgumentException("za krótki pseudonim, musi zawierać więcej niż 3 znaki");
        if(names.contains(name))
            throw new IllegalArgumentException("Nazwa gracza jest już zajęta");
        this.name = name;
        this.score = 0;
        this.lifes = 5;

        this.playersCounter++;
    }

    @Override
    public void finalize(){
        playersCounter--;
        names.remove(name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,score,lifes);
    }

    @Override
    public boolean equals(Object o){

        if(this.name == ((Player)o).name)
            return true;
        else
            return  false;
    }

    @Override
    public String toString(){
        return "Pseudonim gracza: " + this.name + " liczba punktów: " + " pozostała liczba żyć: " + this.lifes;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getScore() { return score; }
    public void setScore(int score) {
        if(this.lifes < 1)
            throw new IllegalArgumentException("Liczba punktów nie może być zwiększona gdy gracz nie ma już żyć!");
        this.score = score; }
    public int getLifes() { return lifes; }
    public void setLifes(int lifes) {
        if(this.lifes <lifes)
            throw new IllegalStateException("Liczba żyć nie może być zwiększana!");
        this.lifes = lifes; }
    public static int getPlayersCounter() { return playersCounter; }
}
