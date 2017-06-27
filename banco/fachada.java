/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author artmario
 */
public class fachada
{
    private repositorio contas;
    
    private fachada()
    {
        this.contas = new repositorio();
        
    }
    public void inserir(conta nova)
    {
        this.contas.inserir(nova);
    }
    public void remover(int index)
    {
        this.contas.removerByindex(index);
        
    }
    public void remover(String num)
    {
        this.contas.removerByNum(num);
    }
    public static fachada getInstance()
    {
        return fachadaHolder.INSTANCE;
    }
    
    private static class fachadaHolder
    {

        private static final fachada INSTANCE = new fachada();
    }

    @Override
    public String toString()
    {
        return this.contas.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
