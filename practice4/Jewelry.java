package practice4;
public class Jewelry {
    Color color;
    String name;
    protected int cost;
    public Jewelry(){
        name = " ";
        cost = 0;
        color = Color.RED;

    }
    public Jewelry(String name, int cost, Color color){
        this.name = name;
        this.cost = cost;
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }



    public String toString(){
        return "gkrl;kr";
    }

}