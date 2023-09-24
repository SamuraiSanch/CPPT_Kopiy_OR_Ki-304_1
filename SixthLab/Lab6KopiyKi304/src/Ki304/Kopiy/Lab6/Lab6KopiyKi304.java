package Ki304.Kopiy.Lab6;
import java.util.*;
/**
 * Class Lab6KopiyKi304 realize example program to lab6
 * @author Kopiy Olexandr
 * @version 1.2
 * @since version 1.0
 */
public class Lab6KopiyKi304 {
    public static void main(String[] args) {
        Building <? super Data> building = new Building <Data> ();
        building.AddData(new House("Banderu 23" , false , 200));
        building.AddData(new Skyscraper("Banderu 12" , 350));
        building.AddData(new House("Banderu 43" , false , 300));
         building.AddData(new Skyscraper("Banderu 30" , 2050));
        building.AddData(new House("Banderu 7" , true , 140));
        Data res1 = building.findMin();
        Data res2 = building.findMax();
        System.out.println("The greatest: ");
        res1.print();
        System.out.println("The smallest: ");
        res2.print();
    }
}
/**
 * Parameterized class <code>Building</code> implements building
 */
class Building<T extends Data>{
    private ArrayList<T> arr;
    public Building() {
        arr = new ArrayList<T>();
    }
    /**
     * Method finds the tallest building
     * @return max
     */
    public T findMax()
    {
if(!arr.isEmpty()){
    T max = arr.get(0);
    for (int i = 1;i<arr.size();i++){
        if(arr.get(i).compareTo(max)<0)
        max = arr.get(i);
    }
    return max;
}
return null;
    }
    /**
     * method finds the lowest building
     * @return min
     */
public T findMin(){
    if(!arr.isEmpty()){
    T min = arr.get(0);
    for (int i = 1;i<arr.size();i++){
        if(arr.get(i).compareTo(min)>0)
        min = arr.get(i);
    }
    return min;
}
return null;
}
public void AddData(T data){
    arr.add(data);
    System.out.println("Element added: ");
    data.print();
}
public void DeleteData(int i){
    arr.remove(i);
}  
}
/**
 * Interface <code>Data</code> implements data
 */
interface Data extends Comparable<Data>
{
public int getHeight();
public void print();
}
/**
 * Class <code>House</code> implements house
 */
class House implements Data{
    private String street;
    private boolean occupancy;
    private int height;
    /**
     * Constructor
     * @param <code>street_t</code> the place where house is
     * @param <code>occupancy_t</code> house occupancy
     * @param <code>height_t</code> the height of house
     */
    public House(String street_t, boolean occupancy_t , int height_t){
street = street_t;
occupancy=occupancy_t;
height=height_t;
    }
    /**
     * Method return street,where house is
     * @return street
     */
    public String getStreet(){
        return street;
    }
    /**
     * Method set street for house
     * @param <code>street_s</code> street,where house is
     */
    public void setStreet(String street_s){
street = street_s;
    }
/**
 * Method return occupancy of house
 * @return occupancy
 */
public boolean getOccupancy(){
    return occupancy;
}
/**
 * Method set occupancy for house
 * @param <code>occupancy_s</code> occupancy of house
 */
public void setOccupancy(boolean occupancy_s){
    occupancy = occupancy_s;
}
/**
 * Method return height of house
 * @return height
 */
public int getHeight(){
return height;
}
/**
 * Method compare objects type Data
 * @param <code>p</code> the height of object
 * @return num (0,1,-1)
 */
public int compareTo(Data p){
    Integer h = height;
    return h.compareTo(p.getHeight());
}
/**
 * Method print information about house
 */
public void print(){
    System.out.println("House on: " + street + ", Occupancy: " + occupancy + ", Height: " + height + " meters\n"); 

    
}
}
/**
 * class <code>Skyscraper</code> implements Skyscraper
 */
class Skyscraper implements Data{
    private String skyscraperStreet;
    private int skyscraperHeight;
    /**
     * Constructor
     * @param <code>skyscraperStreet_s</code> skyscraper street
     * @param <code>skyscraperHeight_s</code> skyscraper height
     */
    public Skyscraper(String skyscraperStreet_s,int skyscraperHeight_s){
        skyscraperStreet = skyscraperStreet_s;
        skyscraperHeight = skyscraperHeight_s;
    }
/**
 * Method return street of Skyscraper
 * @return skyscraperStreet
 */
    public String getSkyStreet(){
        return skyscraperStreet;
    }
    /**
     * Method set Skyscraper street
     * @param <code>skyscraperStreet_s</code> the skyscraperStreet
     */
    public void setSkyStreet(String skyscraperStreet_s){
skyscraperStreet = skyscraperStreet_s;
    }
    /**
     * Method return height of Skyscraper
     * @return skyscraperHeight
     */
    public int getHeight(){
return skyscraperHeight;
    }
    /**
     * Method set Skyscraper height
     * @param <code>height_t</code> the skyscraperHeight
     */
    public void setHeight(int height_t){
        skyscraperHeight = height_t;
    }
    /**
     * Method compare objects type Data
     * @param <code>p</code> the height of object
     * @return num(0,1,-1);
     */
public int compareTo(Data p){
    Integer h = skyscraperHeight;
    return h.compareTo(p.getHeight());
}
/**
 * Method print information about skyscraper
 */
public void print(){
    System.out.println("Skyscraper on: " + skyscraperStreet + ", Height: " + skyscraperHeight + "\n");
}
}