import java.util.Date;
import java.awt.*;

public class App { 
    // main method is just to start the program is a MUST in java
    public static void main(String[] args) {
        // this is non-primitive data type
        String favFruit = "cherry berry";
        System.out.println(favFruit);

        Point point1 = new Point(10,20);
        Point point2 = point1;
        System.out.println(point1.x + " : " + point2.y);
        
        // to get the date you need the util.date pageage
        Date now = new Date();
        System.out.println(now);

        // for loop
        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for(String name : names){
            System.out.println(name);
        }

         // this is primitive data type
        int n = 5; 
        System.out.println(n % 6);
        boolean isValid = true;
        System.out.println(isValid);


    }
}