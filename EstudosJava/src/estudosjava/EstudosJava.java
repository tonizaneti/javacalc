package estudosjava;
import java.util.Scanner;
/**
 *
 * @author Agência Zaneti
 */
public class EstudosJava {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader =new Scanner(System.in);
        
        System.out.println("What is The Number?");
        String num= reader.nextLine();
        int a=Integer.parseInt(num);
        switch (a)
        {
            case 1:
                System.out.println("Correct!"+a);
                break;
            case 2:
                System.out.println("Erro"+a);
                break;
            default:
                    System.out.println("Incorrect!"+a);
                    break;
        }
    }
}