package E2015;

import java.util.*;

public class ConcurrentStack {
    private volatile Object[] data;
    private int size;
    private int i;

    public ConcurrentStack(int size){
        this.data = new Object[size];
    }

    public synchronized void push(Object object){
        if(i >= size) {
            Object[] tmp = data;
            size *= 2;
            data = new Object[size];
            //System.arraycopy(tmp,0,data,0,tmp.length);
            data = Arrays.copyOf(tmp, tmp.length);
        }
        data[i++] = object;
        notifyAll();

    }
    public synchronized Object pop(){

            if(i<=0)
                try {
                    wait();
                }catch (InterruptedException e){

                }
        return data[--i];
    }
}
