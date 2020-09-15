package Factory.PizzaStore;

import Factory.Pizza.*;

public class ChicagoPizzaStore extends PizzaStore{
    public Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(item.equals("Clam")){
            return new ChicagoStyleClamPizza();
        }else if(item.equals("Pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }else if(item.equals("Veggie")){
            return new ChicagoStyleVeggiePizza();
        }else return null;
    }
}
