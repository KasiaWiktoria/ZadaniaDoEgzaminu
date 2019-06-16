public class MyIOException extends Exception {
    private String fault;
    private int line;

    public MyIOException(String fault, int line){
        this.fault = fault;
        this.line = line;
    }

    public String getFault(){return fault;}
    public int getLine(){ return line;}
}
