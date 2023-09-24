package Ki304.Kopiy.Lab4;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;
/**
* Class <code>Lab4KopiyKi304</code> Implements driver for Equations class
* @author Kopiy Olexandr
* @version 1.2
*/
public class Lab4KopiyKi304 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try
        {
        out.print("Enter file name: ");
        Scanner in = new Scanner(System.in);
        String fName = in.nextLine();
        PrintWriter fout = new PrintWriter(new File(fName));
try
        {
        try
        {
        Equations eq = new Equations();
        out.print("Enter X: ");
        fout.print(eq.calculate(in.nextInt()));
        }
        finally
        {
        // Цей блок виконається за будь-яких обставин
        fout.flush();
        fout.close();
        }
        }
        catch (CalcException ex)
        {
        // Блок перехоплює помилки обчислень виразу
        out.print(ex.getMessage());
        }
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
public double calculate(int x) throws CalcException
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
