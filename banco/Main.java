public class Main
{
    public static void main(String[] args)
    {
        fachada fac=fachada.getInstance();
        fac.inserir(new poupanca("2342"));
        fac.inserir(new bonificada("242"));
        fac.inserir(new contaSimples("2423"));
        System.out.println(fac);
        fac.creditar("242", 166);
        System.out.println(fac.getSaldo("242"));
    }
    
}
