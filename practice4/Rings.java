package practice4;

public class Rings extends Jewelry{
	Color color;
    public Rings(){
        super();

    }
    public Rings(String name, int cost, Color color){
        super(name, cost, color);

    }

    @Override
    public String toString() {
        return "cost = " + cost + "color = " + color + "ring style = " + name ;
    }

}
