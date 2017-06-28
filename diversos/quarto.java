
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
        String str,inv;
        Scanner scan=new Scanner(System.in);
        str=scan.nextLine();
        inv="";
        for(int i = str.length(); i >=0 ; i--)
        {
           inv+=str.charAt(i);
        }
        System.out.println(inv);
    }
    
}
