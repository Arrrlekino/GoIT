//import java.util.Scanner;

/**
 * Created by Arlekino on 12/28/2015.
 */

package ua.arlekino.Flower63;
        import java.util.Scanner;
public class Order {
    public static void main(String[] args) {
        System.out.println("Hello! please enter quantyti flowers ");
        final Scanner scanner = new Scanner(System.in);
        final String userInput = scanner.next();
        try {
            final int quantyti = Integer.parseInt(userInput);
            if (quantyti < 0) {
                throw new NegativeQuantytiException(quantyti);
            }
            System.out.println("Vour quantyti is: "+quantyti);
        }catch (NumberFormatException ex) {
            System.out.printf("[Error]: Quantyti should be an integer number!");
        }catch (NegativeQuantytiException e){
            System.out.println("[Error]: Entered quantyti is: "+e.getQuantytiValue()+" quantyti should be >=0!");
        }
    }
}
