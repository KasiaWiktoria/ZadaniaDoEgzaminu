package figura;

public class Figura implements Kształt{
    private final String nazwa;
    private final Kształt kształt;

    public Figura(String nazwa, Kształt kształt){
        this.nazwa = nazwa;
        this.kształt = kształt;
    }

    @Override
    public double obwod(){
        return kształt.obwod();
    }

}
