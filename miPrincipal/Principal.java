package miPrincipal;

public class Principal {
    public String getGreeting()
     {
        return "HOLA MUNDO!";
    }

    public static void main(String[] args) 
    {
        

        Rational r1=new Rational(5,3);
        Rational r2=new Rational(2,3);
        Rational r3=new Rational();
        r3=r1.add(r1, r2);
        System.out.println("RESULTADO DE SUMA:"+r3);

        Rational r4=new Rational();
        r4=r1.Multi(r1,r2);
        System.out.println("EL RESULTADO DE LA MULTIPLICACION DE :"+r4);
        Rational r5=new Rational(7,3);
        System.out.println("EL RESULTADO DE LA COMPARACION DE "+r3+" y "+r5+" es "+r5.equal(r3, r5));
    }
}