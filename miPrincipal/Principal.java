package miPrincipal;

public class Principal {
    public String getGreeting()
     {
        return "HOLA MUNDO!";
    }

    public static void main(String[] args) 
    {
        

        Rational r1=new Rational(5,3);
        Rational r2=new Rational(4,3);
        Rational r3=new Rational();
        r3=r1.add(r1, r2);
        System.out.println("RESULTADO DE SUMA:"+r3);
    }
}