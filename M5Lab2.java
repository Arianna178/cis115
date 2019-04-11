package m5lab2;
import java.util.Scanner ;
/**
 *
 * @author scotta8769
 */
public class M5Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      showMenu();
      getInt();
    
    }
    public static int getInt (){
        int num ;
        num = 0;
            //get number here
            Scanner kb = new Scanner (System.in);
            num = kb.nextInt();
            
            
         return num; 
    }
           
    
    public static void showMenu () {
    System.out.println ("1.Hello");
    System.out.println ("2. Please double a number");
    System.out.println ("3. Take 10%");
    System.out.println("4.What is the gross pay?");
}
    

}
