package practice4;

public class Earrings extends Jewelry {
	Color color;
    public Earrings(){
        super();

    }
    public Earrings(String name, int cost, Color color){
        super(name, cost, color);

    }

    @Override
    public String toString() {
        return "cost = " + cost + "color = " + color + "Earrings style = " + name ;
    }

}
