package Ki304.Kopiy.Lab3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
interface Blooms{
void bloom();
}
/**
 * Class <code>Tree</code> implements tree
 */
public class Tree extends Plant implements Blooms {
    private boolean needWater;
    private String type;
    /**
     * Constructor
     * @throws FileNotFoundException
     */
    public Tree() throws FileNotFoundException{
specific = new Specifics();
appearance = new Appearance();
adaptation = new Adaptation();
f = new PrintWriter(new File("Log.txt"));
needWater = false;
type = "Conifer";
    }
    public Tree(int time_t,String type_t) throws FileNotFoundException
    {
specific = new Specifics(time_t);
appearance = new Appearance();
adaptation = new Adaptation();
f = new PrintWriter(new File("Log.txt"));
needWater = false;
type=type_t;
    }
    /**
     * Method to dry up the tree
     */
    public void setSummer(){
        System.out.println("Summer came and the tree dried up.");
        needWater = true;
        f.println("Summer came and the tree dried up.");
        f.flush();
    }
/**
 * Method check water-status on Tree
 */
    public void checkWater(){
        System.out.println("A tree needs water: " + needWater);
        f.println("A tree needs water: " + needWater);
        f.flush();
    }
    /**
     * Method to see,blooming tree or not
     */
    public void bloom(){
        System.out.println("The tree is blooming. What a beauty!");
        f.println("The tree is blooming. What a beauty!");
        f.flush();
    }
    /**
     * Method give water to Tree
     */
    public void giveWater(){
        System.out.println("You watered the tree! Now it does not need water.");
        needWater = false;
        f.println("You watered the tree! Now it does not need water.");
        f.flush();
    }
    public void checkType(){
        System.out.println("Type of the tree: " + type);
        f.println("Type of the tree: " + type);
        f.flush();
    }
}
