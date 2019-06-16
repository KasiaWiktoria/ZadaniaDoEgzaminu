package figura;

public class Trójkąt implements Kształt{
    private final double bok;

    public Trójkąt(double a){
        this.bok = a;
    }
    @Override
    public double obwod(){
        return 3*bok;
    }
}
