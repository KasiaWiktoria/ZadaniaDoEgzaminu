/*
Proszę napisać klasę Stack reprezentującą stos:
1. Stack implementuje metody void push( Object x) i Object pop().
2. Na stos można odkładać różne obiekty (nie muszą być tego samego typu).
3. Jeśli metoda pop stwierdza, że stos jest pusty, to zwraca null.
 */

import java.util.List;

public class Stack {

    private List<Object> lista;
    private Object[] zawartosc;
    private int rozmiar;
    private int iterator;

    public void push(Object x){
        this.zawartosc[this.iterator++] = x;
    }

    public Object pop(){
        for (int i = 0; i < rozmiar; i++) {
            if (this.zawartosc[i] == null)
                return null;
        }
        return this.zawartosc[this.iterator--];
    }
}
