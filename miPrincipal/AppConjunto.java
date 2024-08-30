package miPrincipal;

import java.util.Scanner;

public class AppConjunto 
{
    public static void menu()
    {
        System.out.println("======================================");
        System.out.println("  OPERACIONES CON CONJUNTOS  ");
        Scanner consola=new Scanner(System.in);
        Conjunto A=new Conjunto();
        if(A.esVacio())
        {
            System.out.println(" EL CONJUNTO ESTA VACIO ");
        }
        else
        System.out.println(" EL CONJUNTO NO ESTA VACIO ");

        //AÑADIR ELEMENTO AL CONJUNTO

        Integer ele=4;
        A.añadir(ele);
        ele=7;
        A.añadir(ele);
        ele=2;
        A.añadir(ele);
        ele=5;
        A.añadir(ele);
        System.out.println(" EL CONJUNTO A TIENE : "+A.getcardinal()+ " ELEMENTOS");
        ele=4;
        A.añadir(ele);
        System.out.println(" EL CONJUNTO A TIENE : "+A.getcardinal()+ " ELEMENTOS");

        //CREAMOS OTRO CONJUNTO
        Conjunto B=new Conjunto();
        ele=6;
        B.añadir(ele);
        ele=3;
        B.añadir(ele);
        B.añadir(4);
        B.añadir(10);
        System.out.println(" EL CONJUNTO B TIENE : "+B.getcardinal()+ " ELEMENTOS");
        B.retirar(10);
        System.out.println(" EL CONJUNTO C TIENE : "+B.getcardinal()+ " ELEMENTOS");
        
       Conjunto C=A.union(B);
       System.out.println(" EL CONJUNTO C TIENE : "+C.getcardinal()+ " ELEMENTOS");
       System.out.println(C.toString());
    }
}
