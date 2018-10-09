/*
 * William Zwart
 * 18/9/18
 * This will calculate the area of a circle and display it.
 */
package area.of.a.circle;

/**
 *
 * @wizwa9381
 */
public class AreaOfACircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius = 15.0;
        double pi = 3.14;
        double area = 0.0;
        // algorithm for area calc
        area = pi * radius * radius;
        System.out.println("the area ..." + area + " cm squared");

        // TODO code application logic here
    }
    
}
