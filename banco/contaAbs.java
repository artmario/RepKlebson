public abstract class contaAbs
{
    private final String num;
    private double saldo;

    public contaAbs(String num)
    {
        this.num = num;
        this.saldo = 0;
    }

    public void creditar(double valor)
    {
        this.saldo += valor;
    }
    public void debitar(double valor)
    {
        this.saldo -= valor;
    }
    public double getSaldo()
    {
        return saldo;
    }

    public String getNum()
    {
        return num;
    }
    
}
