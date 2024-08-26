package miPrincipal;

public class Principal {
    public String getGreeting() {
        return "HOLA MUNDO!";
    }

    public static void main(String[] args) {
        System.out.println(new Principal().getGreeting());
        //Probar la clase Rational

        Rational R1=new Rational(5,3);
        Rational R2=new Rational(4,3);
        Rational R3=new Rational();
        R3=R1.Suma(R1, R2);
        System.out.println("RESULTADO DE SUMA:"+R3);
    }
}