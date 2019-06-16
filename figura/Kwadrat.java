package figura;

public class Kwadrat implements Kształt {
    private final double bok;

    public Kwadrat(double a){
        this.bok = a;
    }
    @Override
    public double obwod(){
        return 4*bok;
    }
}
