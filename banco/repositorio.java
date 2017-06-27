
public class repositorio
{

    private contaAbs contas[];
    private int indice;
    private final int TAMANHO = 100;

    public repositorio()
    {
        this.contas = new contaAbs[TAMANHO];
        this.indice = 0;
    }

    public int getId(String num)
    {
        for (int i = 0; i < indice; i++)
        {
            if (contas[i].getNum().equals(num))
            {
                return i;
            }

        }
        return -1;
    }

    public void inserir(contaAbs nova)
    {
        contas[indice] = nova;
        indice++;
    }

    public void removerByindex(int x)
    {
        if (x < indice && x > 0)
        {
            for (int i = x; i < indice - 1; i++)
            {
                contas[i] = contas[i + 1];
            }
            contas[indice - 1] = null;
            indice--;
        }
    }

    public void removerByNum(String num)
    {
        removerByindex(getId(num));
    }

    public void creditar(String num, double valor)
    {
        if (valor > 0)
        {
            int index = this.getId(num);
            if (index >= 0)
            {
                this.contas[index].creditar(valor);
            }
        }
    }

    public double getSaldo(String num)
    {
        int index = this.getId(num);
        if (index > 0)
        {
            return this.contas[getId(num)].getSaldo();
        }
        return -1;
    }

    public void debitar(String num, double valor)
    {
        if (valor > 0)
        {
            int index = this.getId(num);
            if (index >= 0)
            {
                this.contas[index].debitar(valor);
            }
        }
    }

    @Override
    public String toString()
    {
        String ret = "";
        for (int i = 0; i < indice; i++)
        {
            ret += this.contas[i].getNum() + "\n";
        }
        return ret; //To change body of generated methods, choose Tools | Templates.
    }
}
