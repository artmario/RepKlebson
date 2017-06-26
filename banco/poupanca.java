/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author artmario
 */
public class poupanca extends conta
{
    
    public poupanca(String num, float saldo)
    {
        super(num);
    }

    public poupanca(String num)
    {
        super(num);
    }
    
    public void renderJuro(double taxa)
    {
        double redimento=this.getSaldo()*taxa;
        this.creditar(redimento);
        
    }
    
}
