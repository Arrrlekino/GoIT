class MusicalInstruments {
    private String type;
    private String color;
    private double price;
    public double getPrice() {
        return price; }
    public void setPrice(double price) {
        this.price = price;
    }
    }
//создаем классы-наследники

class Guitar extends MusicalInstruments{
    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
class Piano extends MusicalInstruments{
    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
class Trumpet extends MusicalInstruments {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class MusicalShop {

    //используем отношение has-a
    private MusicalInstruments musicalinstruments;

    public MusicalShop() {
        this.musicalinstruments = new MusicalInstruments();
        musicalinstruments.setPrice(200.50);
    }

    public double getPrice()
    {

        return musicalinstruments.getPrice();
    }

}