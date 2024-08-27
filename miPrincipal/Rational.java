package miPrincipal;

public class Rational 
{
    private int r[]=new int[2];

    public Rational()
    {
       this.r[0]=1;
       this.r[1]=1; 
    }
    
    public Rational(int a,int b)
    {
       this.r[0]=a;
       this.r[1]=b; 
    }
    public Rational add(Rational a, Rational b)
    {
        Rational X=new Rational();
        X.setNumerador(a.getNumerador()*b.getDenominador()+a.getDenominador()*b.getNumerador());
        X.setDenominador(a.getDenominador()*b.getDenominador());
        return X;
    }

       public Rational Multi(Rational a, Rational b)
       {
        Rational X=new Rational();
        X.setNumerador(a.getNumerador()*b.getNumerador());
        X.setDenominador(a.getDenominador()*b.getDenominador());

        return X;
       }
       public boolean equal(Rational a,Rational b)
       {
        return a.getNumerador()*b.getDenominador()
        ==b.getNumerador()*a.getDenominador();
       }
       
    public int getNumerador()
    {
        return r[0];
    }
    public int getDenominador()
    {
        return r[1];
    }

    public void setNumerador(int a)
    {
        r[0]=a;
    }
    public void setDenominador(int b)
    {
        r[1]=b;
    }

    @Override
    public String toString()
    {
        return r[0]+"/"+r[1];
    }
}