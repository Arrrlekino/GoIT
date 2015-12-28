/**
 * Created by Arlekino on 12/28/2015.
 */
package ua.arlekino.Flower63;
public class Rosebush {


    //используем отношение has-a
    private Rose rose;

    public Rosebush(){
        this.rose=new Rose();
        rose.setColor("Red");
    }
    public String getColor() {
        return rose.getColor();
    }

}