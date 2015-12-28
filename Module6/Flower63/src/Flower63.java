/**
 * Created by Arlekino on 12/28/2015.
 */
package ua.arlekino.Flower63;
//import java.util.Scanner;
public class Flower63 {
    private String name;
    private double price;
    private int size;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
class Bouquet {

    //используем отношение has-a
    private Flower63 flower;

    public Bouquet(){
        this.flower=new Flower63();
        flower.setPrice(2.10);
    }
    public double getPrice() {
        return flower.getPrice();
    }

}