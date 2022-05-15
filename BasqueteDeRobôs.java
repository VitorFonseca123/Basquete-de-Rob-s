
package basquete.de.robôs;
import java.util.Scanner;
/**
 *
 * @author Vitor
 */
public class BasqueteDeRobôs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int D = in.nextInt();
        if(D <= 800){
            System.out.println(1);
        }else if(D>800 && D<=1400){
            System.out.println(2);
        }else if(D>1400 && D<=2000){
            System.out.println(3);
        }
    }
    
}
