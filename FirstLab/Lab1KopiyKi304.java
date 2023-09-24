import java.io.*;


/**
 * Class Lab1KopiyKi304 realize program to lab1
 * @author Kopiy Olexandr
 * @version 1.2
 * @since version 1.0
 */
public class Lab1KopiyKi304 {
    /**
     * Static method main is enter point to program
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
       
      
        
        Scanner in = new Scanner(System.in);
        File dataFile = new File("FirstLab\\Lab1.txt");
        PrintWriter f = new PrintWriter(dataFile);

        System.out.print("Enter gear size 2<>120: ");
        byte Rows = in.nextByte();
        in.nextLine();

        if (Rows <= 2) {
            System.out.println("Incorrect array size.");
            System.exit(0);
        }
        if (Rows >120){
            System.out.println("Incorrect array size.");
            System.exit(0);
        }
        char[][] arr = new char[Rows][];
     


        System.out.print("\nEnter one character: ");
        String filler = in.nextLine();
        if (filler.length() != 1) {
            System.out.println("Invalid character entered");
            System.exit(0);
        }
 // Заповнення зубчастої матриці згідно варіанту
        for (int i = 0; i < Rows; i++) {
            arr[i] = new char[Rows - i];
            for (int j = 0; j < Rows - i; j++) {
                arr[i][j] = (char) filler.codePointAt(0);
            }
        }



 for (int i = 0; i < Rows; i++) {
    for (int j = 0; j < Rows - i; j++) {
        System.out.print(arr[i][j] + " ");
         f.print(arr[i][j] + " ");
    }
    System.out.println();
     f.print("\n");
}


        f.flush();
        f.close();
        in.close();
    }
}
