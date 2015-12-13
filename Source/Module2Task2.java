/**
 * Created by Arlekino on 12/13/2015.
 */
import java.util.Vector;

public class Astra {

    public String Color;

    public Integer Size;

    public Vector  myBuket;

}

public class Buket {

    public Integer Price;

    public String Color;

    public Vector  myRose;
    public Vector  myRomashka;
    public Vector  myAstra;

}
public class Flower extends Rose, Romashka, Astra {

    public String Color;

    public Integer Size;

}

public class Romashka {

    public String Color;

    public Integer Size;

    public Vector  myBuket;

}

public class Rose {

    public String Color;

    public Integer Size;

    public Vector  myBuket;

}
public class Rosebush {

    public String Color;

    public Integer Size;

    public Integer Price;

}
public class Tulpan {

    public Integer Lenght;

    public String Color;

    public Integer Price;

}