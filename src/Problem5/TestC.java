package Problem5;

public class TestC {

  public static void main(String[] args) {

    Circuit a = new Resistor(3.0);
    Circuit b = new Resistor(3.0);
    Circuit c = new Resistor(6.0);
    Circuit d = new Resistor(3.0);
    Circuit e = new Resistor(2.0);
    Circuit f = new Series(a, b);
    Circuit g = new Parallel(a, b);
    Circuit h = new Series(g, e);
    Parallel circuit = new Parallel(h, f);
    System.out.println( circuit.getResistance());

  }

}