package Ki304.Kopiy.Lab2;
import java.io.FileNotFoundException;
/**
 * Class Lab2KopiyKi304 realize program to lab2
 * @author Kopiy Olexandr
 * @version 1.2
 * @since version 1.0
 */
public class Lab2KopiyKi304  {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws Exception {
       Plant plant1 = new Plant(20);
       plant1.showYear();
       plant1.showStatus();
       for(int i = 0;i<20;i++){
       plant1.skipYear();
       }
        plant1.showYear();
       plant1.showStatus();
       plant1.printTaste();
       plant1.giveAnotherTaste("Bitter");
    plant1.printTaste();
       plant1.printHeight();
       plant1.addHeight();
       plant1.printHeight();
       plant1.subHeight();
       plant1.printHeight();
       plant1.changeAdjustment("Like water");
       plant1.changeTone("Black");
    }

}
