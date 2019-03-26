import java.util.ArrayList;

public abstract class ingredientes {

    private String b;
    private String c;
    private String a;

    //region getsYsets
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    //endregion

    abstract String toStringIngredientes (String a, String b, String c);



}
