
public class ProgramameuArray 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MeuArray x = new MeuArray(1,3,3,4,5);
        System.out.println(x);
        System.out.println(x.getGreater());
        x.ChagePosition();
        System.out.println(x);
        System.out.println(x.countNumber(3));
        

    }

    
}
