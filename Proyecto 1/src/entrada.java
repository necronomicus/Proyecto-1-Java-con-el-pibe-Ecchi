public class entrada extends ingredientes {
    @Override
    String toStringIngredientes(String a, String b, String c) {

        if (a.equalsIgnoreCase("tomate") || a.equalsIgnoreCase("zanahoria") || a.equalsIgnoreCase("lechuga")
                && b.equalsIgnoreCase("tomate") || b.equalsIgnoreCase("zanahoria") || b.equalsIgnoreCase("lechuga")
                && c.equalsIgnoreCase("tomate") || c.equalsIgnoreCase("zanahoria") || c.equalsIgnoreCase("lechuga"))
            return "Usted ha hecho una entrada";
        else
            return "No es una entrada";
    }
    public entrada(String a, String b, String c)
    {

        setA(a);
        setB(b);
        setC(c);

    }
}
