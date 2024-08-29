package miPrincipal;
import java.util.Scanner;

public class Principal {
    public String getGreeting()
     {
        return "HOLA MUNDO!";
    }

    public static void main(String[] args) 
    {
        Scanner consola=new Scanner(System.in);
        int opc=0;
       do{
            System.out.println("=====================================");
            System.out.println(" TIPOS DE DATOS ABSTRACTOS  ");
            System.out.println("=====================================");
            System.out.println("1) Rational");
            System.out.println("2) Matriz");
            System.out.println("3) Cadena");
            System.out.println("4) Numerote");
            System.out.println("5) Conjunto");
            System.out.println();
            System.out.println("0) Salir");
            System.out.println("SELECCIONE UNA OPCION");
            opc=consola.nextInt();
            switch (opc) {
                case 1:
                AppRational.menu();;
                    
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                AppConjunto.menu();
                    break;
                case 0:
                    System.out.println("HASTA LUEGO:");
                    break;
            
                default:
                    
            }

         }while(opc!=0);
        
    }
}