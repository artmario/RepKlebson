/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author artmario
 */
public class conta
{
    private final String num;
    private double saldo;

    public conta(String num)
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
    
    
    
    
}
