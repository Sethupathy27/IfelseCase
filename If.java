import java.util.Scanner;


/**
 *
 * @author sethu
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int input;
     System.out.println("Enter your age : ");
     Scanner s = new Scanner (System.in);
     input = s.nextInt();
        if(input > 18)
            System.out.println("you are eligible to vote.");
        else
            System.out.println("you are not eligible to vote.");
        
    }
    
}
