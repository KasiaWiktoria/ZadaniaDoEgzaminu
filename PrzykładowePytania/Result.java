import java. util.*;

public class Result implements Comparable<Result> {
    private String id;
    private int intR;
    private double doubleR;
    private Set<String> idSet;

    public Result(String id, int intR, double doubleR){
        if(idSet.contains(id))
            throw new IllegalArgumentException("Istnieje już obiekt o danym id");

        this.doubleR = doubleR;
        this.intR = intR;
        this.id = id;
        this.idSet.add(id);
    }

    @Override
    public int hashCode(){
        return Integer.parseInt(id);
    }

    @Override
    public boolean equals(Object o){
        return this.hashCode() == ((Result)o).hashCode();
    }

    @Override
    public int compareTo(Result r){
        return this.hashCode() - r.hashCode();
    }


}
