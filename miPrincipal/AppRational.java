package miPrincipal;
import java.util.Scanner;
public class AppRational 
{
    public static void menu() throws Exception 
    {
        System.out.println("======================================");
        System.out.println("  OPERACIONES CON NUMEROS RACIONALES  ");
        Scanner consola=new Scanner(System.in);
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

        System.out.println("EL RESULTADO DE LA COMPARACION DE "+r3+" y "+r5+" es "+r3.equal(r5));

        //PROBAR UN RACIONAL CON DENOMINADOR 0
        Rational r6=new Rational(5,0); //LANZA UNA EXCEPTION
        System.out.println(" VALOR DEL RACIONAL ="+r6.toString());
    }
    
}
