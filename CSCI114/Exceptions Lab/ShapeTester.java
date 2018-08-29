import java.util.ArrayList; // to create array lists
import java.io.*; // for PrintWriter, IOException
import java.util.*; // for Scanner

/**
 * Run and tests Shape classes
 *
 * @author Shana Moore
 * @version 5/14/2018
 */
public class ShapeTester
{
    /**
     * Constructor for objects of class ShapeTester
     */
    public static void main(String args[]) throws IOException
    {
        // create a new array list named shapes
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        // open Shapes.txt file for input
        Scanner input = new Scanner(new File("Shapes.txt"));

        //read the data file and add shpaes to the new Triangle obj

        String triangle_color = input.nextLine();
        boolean triangle_fill = input.nextBoolean();
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();   

        Shape triangle = new Triangle (triangle_color, triangle_fill, a, b, c);
        shapes.add(triangle);

        // read the data file and add to shapes the new Rectangle obj
        String rectangle_color = input.next();
        boolean rectangle_fill = input.nextBoolean();
        double length = input.nextDouble();
        double width = input.nextDouble();
        
        Shape rectangle = new Rectangle(rectangle_color, rectangle_fill, length, width);
        shapes.add(rectangle);
       
        // read the data file and add to shape the new Circle obj
        String circle_color = input.next();
        boolean circle_fill = input.nextBoolean();
        double radius = input.nextDouble();
        
        Shape circle = new Circle(circle_color, circle_fill, radius);
        shapes.add(circle);
        
        // open an output.txt file for output
        PrintWriter ot = new PrintWriter(new FileWriter("output.txt"));
        
        /* traverse shapes and for each of the starting shapes in turn, print toString(), perimeter, then area,
         * to 2 decimal places and all nicely labelled.  (All output must be sent to the output.txt output 
         * file, and also to the Terminal Window as usual)
         */
        System.out.println("Starting shapes");
        ot.println("Starting shapes");
        for (Shape shape: shapes){
            System.out.println(shape.toString());
            System.out.printf("Perimeter is: %.2f\n", shape.perimeter());
            System.out.printf("Area is: %.2f\n", shape.area());
            
            // output to output.txt file
            ot.println(shape.toString());
            ot.printf("Perimeter is: %.2f\n", shape.perimeter());
            ot.printf("Area is: %.2f\n", shape.area());            
        }

 
        /* in shapes, change the Triangle filled to false, the Rectangle color to “blue”, and the Circle to 
         * become “black” and filled true
         */
        shapes.set(0, new Triangle(triangle_color, false, a, b, c));
        shapes.set(1, new Rectangle("blue", rectangle_fill, length, width));        
        shapes.set(2, new Circle("black", true, radius));
        
        System.out.println("\n\nChanged shapes");
        ot.println("\n\nChanged shapes");
        // traverse shapes again and print toString() to show the changed shapes, nicely labelled
        for (Shape shape: shapes){
            System.out.println(shape.toString());
            System.out.printf("Perimeter is: %.2f\n", shape.perimeter());
            System.out.printf("Area is: %.2f\n", shape.area());
            
            // output to output.txt file
            ot.println(shape.toString());
            ot.printf("Perimeter is: %.2f\n", shape.perimeter());
            ot.printf("Area is: %.2f\n", shape.area());            
        }        
        
        input.close();
        ot.close();
    }

}
