/**
 * Created by Arlekino on 12/21/2015.
 */
public class Areas {

    public static void main(String[] argss) {
        byte a = 40;
        byte b = 30;
        double areaRec = (double)(a * b);
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + a * b);
        double areaTri = (double)(a * b / 2);
        System.out.println("Площадь прямоугольного треугольника с катетами " + a + " и " + b + " равна " + areaTri);
        double c = 3.0D;
        double d = 4.0D;
        double e = 5.0D;
        double p = (c + d + e) / 2.0D;
        double areaTre = Math.sqrt(p * (p - c) * (p - d) * (p - e));
        System.out.println("Площадь треугольника со сторонами " + c + ", " + d + " и " + e + " равна " + areaTre);
        double PI = 3.14D;
        double areaCir = (double)(a * a) * 3.14D;
        System.out.println("Площадь круга с радиусом " + a + " равна " + areaCir);
    }
}