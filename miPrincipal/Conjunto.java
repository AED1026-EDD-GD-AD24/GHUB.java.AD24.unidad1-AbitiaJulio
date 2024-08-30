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
        return encontrado;
    }
   
    //AÑADIR UN ELEMENTO SI NO ESTA EN EL CONJUNTO
    public void añadir(Object elemento)
    {
        if(!pertenece(elemento))
        {
            //VERIFICAR SI HAY POSICIONES DISPONIBLES
            //EN CASO CONTRARIO AMPLIAR EL CONJUNTO
            if(cardinal==capacidad)
            {
                Object nuevoCto[];
                nuevoCto=new Object[capacidad+M];

                for(int k=0;k<capacidad;k++)
                {
                    nuevoCto[k]=cto[k];
                }
                capacidad+=M;
                cto=nuevoCto;
            }
            cto[cardinal]=elemento;
            cardinal++;
        }
    }
    //QUITA EL ELEMENTO DEL CONJUNTO
    public void retirar(Object elemento)
    {
        if(pertenece(elemento))
        {  //LOCALIZAR EL ELEMENTO
            int k=0;
            while (!cto[k].equals(elemento))
                k++;
               
            //RECORRER DESDE EL ELEMENTO K HASTA LA ULTIMA
             //POSICION, MOVER LOS ELEMENTOS A LA IZQUIERDA
         for(int K=0;k<cardinal;k++)
         {
            cto[k]=cto[k+1];
         }
         cardinal--; //CARDINAL=CARDINAL+1;
        }
    }
    //DEVUELVA EL NUMERO DE ELEMENTOS
    public int getcardinal()
    {
        return this.cardinal;
    }

    //OPERACION DE UNION DE DOS CONJUNTOS
    public Conjunto union (Conjunto c2)
    {
        Conjunto u=new Conjunto();
        //PRIMERO COPIA EL PRIMER CONJUNTO DE LA UNION 
        for(int K=0;K<cardinal;K++)
        {
            u.cto[K]=cto[K];
        }
        u.cardinal=cardinal;
        //AÑADIR LOS ELEMENTOS DE c2 NO INCLUIDOS
        for(int k=0;k<c2.cardinal;k++)
        {
            u.añadir(c2.cto[k]);
        }
        return u;
    }
    @Override
    public String toString()
    {
        String s="{";
        
            for(int K=0;K<cardinal;K++)
            {
                s+=cto[K].toString()+",";
            }if (cardinal>0)
             {
                s=s.substring(0,s.length()-1);
            }
            s+="}";
            return s;
        
    }
}


