package Decorator.StarbuzzCoffee.Component;

public abstract class Beverage {
    String description = "Unknown Beverage";
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
