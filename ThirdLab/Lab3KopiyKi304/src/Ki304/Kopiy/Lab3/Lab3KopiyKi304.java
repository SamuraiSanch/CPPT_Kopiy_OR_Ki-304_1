package Ki304.Kopiy.Lab3;
import java.io.FileNotFoundException;
/**
 * Class Lab3KopiyKi304 realize program to lab3
 * @author Kopiy Olexandr
 * @version 1.2
 * @since version 1.0
 */
public class Lab3KopiyKi304  {
     /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws Exception {
        Tree plant1 = new Tree(20,"Deciduous");
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
        plant1.checkWater();
        plant1.setSummer();
        plant1.checkWater();
        plant1.giveWater();
        plant1.checkWater();
        plant1.bloom();
        plant1.checkType();

    }
}
