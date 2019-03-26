public class platoPrincipal extends ingredientes {

    @Override
    String toStringIngredientes(String a, String b, String c) {

        if(getA().equalsIgnoreCase("Carne") || getA().equalsIgnoreCase("fideos") || getA().equalsIgnoreCase("pan")
                && getB().equalsIgnoreCase("Carne") || getB().equalsIgnoreCase("fideos") || getB().equalsIgnoreCase("pan")
                && getC().equalsIgnoreCase("Carne") || getC().equalsIgnoreCase("fideos") || getC().equalsIgnoreCase("pan"))
        return "Usted ha hecho un plato principal";
        else
          return  "No es un plato principal";

    }

    public platoPrincipal(String a, String b, String c)
    {

        setA(a);
        setB(b);
        setC(c);

    }

    //DEBERIA DEJAR EN LA CLASE INGREDIENTES EL METODO A OVERRIDEAR UN PUBLIC TOSTRINGCOMIDA.
    //LUEGO ACA CONSTRULLO LA CALSE, Y LLAMO A EL METODO OVERRIDEAR Y DEBOLVER SI CONSTRUÍ O NO EL TIPO DE PLATO.

}
