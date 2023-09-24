package Ki304.Kopiy.Lab2;
import java.io.*;


public class Plant {
    private Specifics specific;
    private Appearance appearance;
    private Adaptation adaptation;
    private PrintWriter f;
    static String status;
/**
 * Constructor
 * @throws FileNotFoundException
 */
    public Plant() throws FileNotFoundException{
specific = new Specifics();
appearance = new Appearance();
adaptation = new Adaptation();
f = new PrintWriter(new File("Log.txt"));
    }
/**
 * Constructor
 * @param <code>time_t</code> time when Plant must die
 * @throws FileNotFoundException
 */
    public Plant(int time_t) throws FileNotFoundException{
specific = new Specifics(time_t);
appearance = new Appearance();
adaptation = new Adaptation();
f = new PrintWriter(new File("Log.txt"));
    }
     /**
     * Method skip year
     */
    public void skipYear(){
        System.out.println("Skip 1 year...");
        f.println("Skip 1 year...");
        f.flush();
specific.time--;
if(specific.time<=0){
    specific.isDead();
        f.println("Plant is dead.");
        f.flush();
}
/**
 * Method show time to plant death
 */
    }
    public void showYear(){
        System.out.println("Time to plant death: " + specific.time + " Years.");
        f.println("Time to plant death: " + specific.time + " Years.");
        f.flush();
    }
/**
 * Method show plant is dead or alive
 */
    public void showStatus(){
        System.out.println("Plant alive: " + specific.getStatus());
        f.println("Plant alive: " + specific.getStatus());
        f.flush();
    }
    /**
     * Method provides information about plant taste
     */
    public void printTaste(){
        System.out.println("Plant taste: " + specific.getTaste());
        f.println("Plant taste: " + specific.getTaste());
        f.flush();
    }
    /**
     * Method setting another taste to the plant
     * @param s_taste
     */
    public void giveAnotherTaste(String s_taste){
        System.out.println("Setting another taste...");
        specific.setTaste(s_taste);
        f.println("Setting another taste...");
        f.flush();
    }
    /**
     * Method adds height to our plant
     */
    public void addHeight(){
        System.out.println("Calls addHeight...");
        f.println("Calls addHeight...");
        f.flush();
float a;
a = appearance.getHeight();
a++;
appearance.setHeight(a);
    }
      /**
     * Method subs height to our plant
     */
    public void subHeight(){
        System.out.println("Calls subHeight...");
        f.println("Calls subHeight...");
        f.flush();
        float a;
a = appearance.getHeight();
a--;
appearance.setHeight(a);
    }
      /**
     * Method shows height of our plant
     */
    public void printHeight(){
        System.out.println("Height: " + appearance.getHeight());
        f.println("Height: " + appearance.getHeight());
        f.flush();
    }
   /**
     * Method changes adjustment of our plant
     */
    public void changeAdjustment(String a_adjustment){
        System.out.println("Setting new adjustment: " + a_adjustment);
        f.println("Setting new adjustment: " + a_adjustment);
        f.flush();
adaptation.setAdjustment(a_adjustment);
    }
       /**
     * Method changes tone of our plant
     */
    void changeTone(String s){
        appearance.setTone(s);
        System.out.println("Changing tone to " + s);
        f.println("Changing tone to " + s);
        f.flush();
    }
}
/**
 * class <code>Specifics</code> implements specifics of Plant
 * @author Kopiy Olexandr
 * @version 1.2
 */
class Specifics{
    public int time;
    private String taste;
    private boolean alive;
    /**
     * Constructor
     */
    public Specifics(){
        time = 10;
        taste = "Sweet";
        alive = true;
    }
    /**
     * Constructor
     * @param <code>time_t</code> time when plant dies
     */
    public Specifics(int time_t){
time = time_t;
taste = "Sweet";
alive = true;
    }
/**
 * Method,that kills plant
 */
    void isDead(){
alive = false;
    }
     /**
     * Method checks our plant is alive or not
     */
   boolean getStatus(){
return alive;
   }
   /**
    * Method gets taste of our Plant
    * @return <code>taste</code>
    */
   String getTaste(){
return taste;
   }
   /**
    * Method sets new taste to Plant
    * @param s_taste
    */
   void setTaste(String s_taste){
    taste = s_taste;
   }
}
/**
 * class <code>Appearance</code> implements appearance of Plant
 * @author Kopiy Olexandr
 * @version 1.2
 */
class Appearance{
    private String color;
    private float height;
    private String tone;
    private String form;
    /**
     * Constructor
     */
public Appearance(){
color = "Blue";
height = 12.5F;
tone = "White";
form = "Direct";
    }
    /**
     * Constructor
     * @param <code>t_color</code> sets color to plant
     */
    public Appearance(String t_color){
color = t_color;
height = 12.5F;
tone = "White";
form = "Direct";
    }
    /**
     * Method sets new height to Plant
     * @param <code>h_height</code>
     */
    void setHeight(float h_height){
height = h_height;
    }
    /**
     * Method gets height of our Plant
     * @return <code>height</code>
     */
    float getHeight(){
        return height;
    }
    /**
     * Method sets new tone of our Plant
     * @param <code>s_tone</code>
     */
    void setTone(String s_tone){
tone = s_tone;
    }
}
/**
 * class <code>Adaptation</code> implements adaptation of our Plant
 * @author Kopiy Olexandr
 * @version 1.2
 */
class Adaptation{
    private String adjustment;
    public Adaptation(){
        adjustment = "Drought";
    }
    /**
     * Method sets new adjustment to our Plant
     * @param a_adjustment
     */
    public void setAdjustment(String a_adjustment){
adjustment = a_adjustment;
    }
    
}