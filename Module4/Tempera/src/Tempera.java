/**
 * Created by Arlekino on 12/21/2015.
 */
public class Tempera {

    public static void main(String[] argss) {
        double tempC = 40.0D;
        double f=104.0D;
        double c=(f-32)*5/9;
        double tempF = tempC * 9 / 5 + 32;
        System.out.println("Температура по Цельсию " + tempC + " C " + " равна " + tempF+" F");
        System.out.println("Температура по Фарегейту "+f+ " F " + " равна " + c+" C");
    }
}
