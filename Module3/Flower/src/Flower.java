class Flower {
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
//создаем классы-наследники
class Astra extends Flower{

}
class Romashka extends Flower{

}
class Tulpan extends Flower{

}
class Rose extends Flower{
    public String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}

class Rosebush {

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
class Bouquet {

    //используем отношение has-a
    private Flower flower;

    public Bouquet(){
        this.flower=new Flower();
        flower.setPrice(2.10);
    }
    public double getPrice() {
        return flower.getPrice();
    }

}
/*
    public Flower(){}
public Flower(String name, double price, int size){
    this.Name = name;
    this.Price = price;
    this.Size = size;

}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}*/