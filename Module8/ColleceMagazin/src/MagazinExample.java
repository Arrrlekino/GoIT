/**
 * Created by Arlekino on 1/20/2016.
 */

package ua.arlekinoo.lecture8;
        import java.util.ArrayList;
        import java.util.List;
public class MagazinExample {
    public static void main (String [] args) {
        final List<ColleceMagazin> collectionsList = new ArrayList<>();
        collectionsList.add (new ColleceMagazin("Guitar", "Yellow", (double) 20.00));
        collectionsList.add (new ColleceMagazin("Trumpet", "Grey", (double) 37.50));
        collectionsList.add (new ColleceMagazin("Violin", "Black", (double) 47.99));
        collectionsList
                .stream()
                .map( collections-> collections.getMusicalInstrument ())
                .forEach(musicalInstrument -> System.out.println(musicalInstrument));
                //.size(musicalInstrument -> System.out.println(musicalInstrument));

    }
}
