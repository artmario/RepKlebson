/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author artmario
 */
public class repositorio
{
    private conta contas[];
    private int indice;
    private final int TAMANHO=100;

    public repositorio()
    {
        this.contas=new conta[TAMANHO];
        this.indice = 0;
    }
    public int getId(String num)
    {
        for (int i = 0; i < indice; i++)
        {
            if(contas[i].getNum()==num)
            {
                return i;
            }
            
        }
        return -1;
    }
    
    
}
