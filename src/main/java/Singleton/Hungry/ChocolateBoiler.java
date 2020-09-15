package Singleton.Hungry;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler singleChocolateBoiler = new ChocolateBoiler();

//    static{
//        singleChocolateBoiler = new ChocolateBoiler();
//    }
    
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        return singleChocolateBoiler;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("ChocolateBoiler is filled!");
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
            System.out.println("ChocolateBoiler is drained");
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
            System.out.println("ChocolateBoiler is boiled");
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}

class ChocolateBoilerTest{
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
    }
}
