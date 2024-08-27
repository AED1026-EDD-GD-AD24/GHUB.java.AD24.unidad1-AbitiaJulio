package miPrincipal;

public class Conjunto
 {
    static int M=20;
    private Object cto[];
    private int cardinal;
    private int capacidad;

    //OPERACIONES
    public Conjunto()
    {
        cto=new Object[M];
        cardinal=0;
        capacidad=M;
    }
    //DETERMINAR SI EL CONJUNTO ES VACIO
    public boolean esVacio()
    {
        return (cardinal==0);
    }
    //BUSCA QUE EL ELEMENTO PERTENECE AL CONJUNTO
    public boolean pertenece(Object elemento)
    {
        int k=0;
        boolean encontrado=false;
        while (k<cardinal && !encontrado)
         {
            encontrado=cto[k].equals(elemento);
            k++;
        }
    }
   
    //AÑADIR UN ELEMENTO SI NO ESTA EN EL CONJUNTO
    public void añadir(Object elemento)
    {

    }
}


