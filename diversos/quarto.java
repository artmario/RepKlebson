
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author artmario
 */
public class quarto
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double a,b,c,delta,x1,x2;
        Scanner scan=new Scanner(System.in);
        System.out.println("entre com os valores:");
        a=scan.nextDouble();
        b=scan.nextDouble();
        c=scan.nextDouble();
        delta=(b*b)-(4*a*c);
        System.out.println("");
        if(delta>0)
        {
            x1=(-b+Math.sqrt(delta))/(2*a);
            x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("raizes são "+x1+" e "+x2);
        }
        else if(delta==0)
        {
            x1=-b/(2*a);
            System.out.println("raizes é"+x1);
        }
        else
        {
            System.out.println("delta negativo, não há raizes");
        }
    }
    
}
