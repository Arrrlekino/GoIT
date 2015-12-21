/**
 * Created by Arlekino on 12/21/2015.
 */

public class Starter {
    public static void main(String[] argss) {
        double x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        double a1 = x2 - x1;
        double b1 = y2 - y1;
        double a2 = Math.pow(a1, 2);
        double b2 = Math.pow(b1, 2);
        double c = Math.sqrt(a2 + b2);
        System.out.println("Расстояние между точками с координатами (" + x1 + " ; " + y1 +") и (" + x2 + " ; " + y2 + ") равно " + c);

    }
}
