package miPrincipal;

public class AppPunto 
{
    public static void menu()
    {
        System.out.println("======================================");
        System.out.println("  OPERACIONES CON  PUNTO  ");
       System.out.println("========================================");

       Punto p1=new Punto(2,1);
       Punto p2=new Punto(2,3);
       Punto p3=new Punto(4,1);

       System.out.println("VALOR DE X EN PUNTO1: "+p1.getX());
       System.out.println("VALOR DE Y EN PUNTO1: "+p1.getY());

       System.out.println("VALOR DE X EN PUNTO2: "+p2.getX());
       System.out.println("VALOR DE Y EN PUNTO2: "+p2.getY());

       System.out.println("VALOR DE X EN PUNTO3: "+p3.getX());
       System.out.println("VALOR DE Y EN PUNTO3: "+p3.getY());
    } 
}
