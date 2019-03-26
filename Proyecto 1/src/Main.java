import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Usted está apunto de cocinar." +
                "Puede hacer 3 tipos de comida. Entrada, Plato Principal, o Postre." +
                "Para hacer un plato principal, debe utilizar carne, fideos y pan. " +
                "Para hacer un postre, azucar, leche y chocolate." +
                "Para hacer una entrada, tomate, zanahoria y lechuga" +
                ""+
                "Ingrese su primer ingrediente:");
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();

        while(!a.equalsIgnoreCase("tomate")&&!a.equalsIgnoreCase("zanahoria")&&!a.equalsIgnoreCase("lechuga")
        &&!a.equalsIgnoreCase("azucar")&&!a.equalsIgnoreCase("leche")&&!a.equalsIgnoreCase("chocolate")
        &&!a.equalsIgnoreCase("carne")&&!a.equalsIgnoreCase("fideos")&&!a.equalsIgnoreCase("pan")) {
            System.out.println("Error, por favor ingrese los ingredientes nombrados anteriormente.");
            a = sc.next();
        }
        System.out.println("Ingrese segundo ingrediente");
        String b = sc.nextLine();
        while(!b.equalsIgnoreCase("tomate")&&!b.equalsIgnoreCase("zanahoria")&&!b.equalsIgnoreCase("lechuga")
                &&!b.equalsIgnoreCase("azucar")&&!b.equalsIgnoreCase("leche")&&!b.equalsIgnoreCase("chocolate")
                &&!b.equalsIgnoreCase("carne")&&!b.equalsIgnoreCase("fideos")&&!b.equalsIgnoreCase("pan")) {
            System.out.println("Error, por favor ingrese los ingredientes nombrados anteriormente.");
            b = sc.nextLine();
        }
        System.out.println("Ingrese tercer ingrediente");
        String c = sc.nextLine();
        while(!c.equalsIgnoreCase("tomate")&&!c.equalsIgnoreCase("zanahoria")&&!c.equalsIgnoreCase("lechuga")
                &&!c.equalsIgnoreCase("azucar")&&!c.equalsIgnoreCase("leche")&&!c.equalsIgnoreCase("chocolate")
                &&!c.equalsIgnoreCase("carne")&&!c.equalsIgnoreCase("fideos")&&!c.equalsIgnoreCase("pan")) {
            System.out.println("Error, por favor ingrese los ingredientes nombrados anteriormente.");
            c = sc.nextLine();
        }

        platoPrincipal plato = new platoPrincipal(a,b,c);
        System.out.println(plato.toStringIngredientes(a,b,c));
        postre post = new postre(a,b,c);
        System.out.println(post.toStringIngredientes(a,b,c));
        entrada entr = new entrada(a,b,c);
        System.out.println(entr.toStringIngredientes(a,b,c));




    }
}
