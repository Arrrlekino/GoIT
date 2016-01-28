/**
 * Created by Arlekino on 1/28/2016.
 */

package ua.arlekinoo.lecture9;
        import java.util.ArrayList;
        import java.util.List;
public class ColekceMuzInstruments {
    public static void main (String [] args) {
        final List<ShifrovkaForCentra> collectionsList = new ArrayList<>();
        collectionsList.add (new ShifrovkaForCentra("Гитара", "Yellow", (double) 20.00));
        collectionsList.add (new ShifrovkaForCentra("Труба", "Grey", (double) 37.50));
        collectionsList.add (new ShifrovkaForCentra("Скрипка", "Black", (double) 47.99));
        collectionsList
                .stream()
                .map( collections-> collections.getMusicalInstrument ())
                .forEach(musicalInstrument -> System.out.println(musicalInstrument));
        //.size(musicalInstrument -> System.out.println(musicalInstrument));

    }
}
