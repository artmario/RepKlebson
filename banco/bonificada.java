public class bonificada extends conta
{
    private double bonus;
    
    public bonificada(String num, float saldo)
    {
        super(num);
        this.creditar(saldo);
    }

    public bonificada(String num)
    {
      super(num);
    }

    @Override
    public void creditar(double valor)
    {
        this.bonus+=valor*0.1;
        super.creditar(valor); 
    }
    public void renderBonus()
    {
        this.creditar(bonus);
        bonus=0;
    }

    public double getBonus()
    {
        return bonus;
    }
    
    
    
}
