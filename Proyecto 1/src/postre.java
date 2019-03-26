public class postre extends ingredientes {
    @Override
    String toStringIngredientes(String a, String b, String c) {
        setA(a);
        setB(b);
        setC(c);
        if (a.equalsIgnoreCase("azucar") || a.equalsIgnoreCase("leche") || a.equalsIgnoreCase("chocolate")
                && b.equalsIgnoreCase("azucar") || b.equalsIgnoreCase("leche") || b.equalsIgnoreCase("chocolate")
                && c.equalsIgnoreCase("azucar") || c.equalsIgnoreCase("leche") || c.equalsIgnoreCase("chocolate"))
            return "Usted ha hecho un postre";
        else
            return "No es un postre";
    }

    public postre(String a, String b, String c)
    {

        setA(a);
        setB(b);
        setC(c);

    }
}
