public class Main
{
    public static void main(String[] args)
    {
        fachada fac=fachada.getInstance();
        fac.inserir(new poupanca("2342"));
        fac.inserir(new bonificada("242"));
        System.out.println(fac);
    }
    
}
