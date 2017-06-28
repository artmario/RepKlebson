
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
public class terceiro
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String str,aux;
        Scanner scan=new Scanner(System.in);
        str=scan.nextLine();
        int x=0;
        aux="";
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i)=='a')
            {
                x++;
            }
            else
            {
                aux+=str.charAt(i);
            }
        }
        System.out.println("'a' foi encontrado "+x+" vez(es)");
        str=aux;
        System.out.println(str);
    }
    
}
