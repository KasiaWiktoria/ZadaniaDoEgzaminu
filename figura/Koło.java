package figura;

public class Koło implements Kształt {

    private final double promien;

    public Koło(double r){
        this.promien = r;
    }
    @Override
    public double obwod(){
        return 2*Math.PI*promien;
    }
}
