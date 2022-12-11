package Problem5;

public class Resistor extends Circuit {
  
  double Ohms;
  private double pottentialDifference;
  
  public Resistor(double d) {
    this.Ohms=d;
  }
  
  public double getResistance() {
    return this.Ohms;
  }

  public double getPottentialDifference() {
    return pottentialDifference;
  }

  public void setPottentialDifference(double pottentialDifference) {
    this.pottentialDifference = pottentialDifference;
  }
  
  
  
  public double getPotentialDiff() {
    return getPottentialDifference();
  }
  
  public void applyPotentialDiff(double V) {
    pottentialDifference=V;
  }
}