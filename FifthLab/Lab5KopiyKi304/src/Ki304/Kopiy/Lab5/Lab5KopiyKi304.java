package Ki304.Kopiy.Lab5;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;
/**
* Class <code>EquationsApp</code> Implements driver for Equations class
* @author Kopiy Olexandr
* @version 1.2
*/
public class Lab5KopiyKi304 {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        try
        {
        CalcWFio obj = new CalcWFio();
        Scanner in = new Scanner(System.in);
try
        {
        try
        {
        Equations eq = new Equations();
        out.print("Enter X: ");
        // fout.print(eq.calculate(in.nextInt()));
        double data = eq.calculate(in.nextDouble());
        obj.calculate(data);
        System.out.println("Result: " + obj.getResult());
        obj.writeResultTxt("textResult.txt");
        obj.writeResultBin("binResult.bin");
        obj.readResultBin("binResult.bin");
        System.out.println("Result: " + obj.getResult());
        obj.readResultTxt("textResult.txt");
        System.out.println("Result: " + obj.getResult());
        }
        finally
        {
        // Цей блок виконається за будь-яких обставин
        }
        }
        catch (CalcException ex)
        {
        // Блок перехоплює помилки обчислень виразу
        out.print(ex.getMessage());
        }
        in.close();
        }
        catch (FileNotFoundException ex)
        {
        // Блок перехоплює помилки роботи з файлом навіть якщо вони
        // виникли у блоці finally
        out.print("Exception reason: Perhaps wrong file path");
        }
        }
        

    }
/**
* Class <code>CalcException</code> more precises ArithmeticException
* @author Kopiy Olexandr
* @version 1.2
*/
class CalcException extends ArithmeticException
{
public CalcException(){}
public CalcException(String cause)
{
super(cause);
}
}
/**
* Class <code>Equations</code> implements method for (tg(x)/3x) expression calculation
* @author Kopiy Olxandr
* @version 1.2
*/
class Equations
{
/**
* Method calculates the (tg(x)/3x) expression
* @param <code>x</code> Angle in degrees
* @throws CalcException
*/
public double calculate(double x) throws CalcException
{
double y, rad;
rad = x * Math.PI / 180.0;
try
{
y = Math.tan(rad) / (3*x);
// Якщо результат не є числом, то генеруємо виключення
if (y==Double.NaN || y==Double.NEGATIVE_INFINITY ||
y==Double.POSITIVE_INFINITY || x==90 || x== -90)
throw new ArithmeticException();
}
catch (ArithmeticException ex)
{
// створимо виключення вищого рівня з поясненням причини
// виникнення помилки
if (rad==Math.PI/2.0 || rad==-Math.PI/2.0)
throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
else if (x==0)
throw new CalcException("Exception reason: X = 0");
else
throw new CalcException("Unknown reason of the exception during exception calculation");
}
return y;
}
}
class CalcWFio{
    /**
     * Method write result to text file
     * @param <code>fName</code> Name of the file
     * @throws FileNotFoundException
     */
    private double result;
    public void writeResultTxt(String fName) throws FileNotFoundException{
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f " , result);
        f.close();
    }
    public void readResultTxt(String fName){
        try{
            File f = new File(fName);
            if(f.exists()){
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            } else
            throw new FileNotFoundException("File " + fName + " not found");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    /**
     * Method write result to binary file
     * @param <code>fName</code> Name of the file
     * @throws 
     */
    public void writeResultBin(String fName) throws FileNotFoundException,IOException{
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }
    /**
     * Method read result from binary file
     * @param <code>fName</code> Name of the file
     * @throws
     */
    public void readResultBin(String fName) throws FileNotFoundException,IOException{
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }
    /**
     * Method set x for result
     */
    public void calculate(double x){
        result = x;
    }
    /**
     * Method return result
     */
    public double getResult(){
        return result;
    }
        
}