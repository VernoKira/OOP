package Problem5;

public class Parallel extends Circuit{

  private Circuit a;
  private Circuit b;
  
  public Parallel(Circuit a,Circuit b) {
    this.a=a;
    this.b=b;
  }
  
  public double getResistance() {
    
    return 1.0 / (1.0 / a.getResistance()  +  1.0 / a.getResistance());
  }
  public double getPotentialDiff() {
    return a.getPotentialDiff();
  }
  
  public void applyPotentialDiff(double V) {
    a.applyPotentialDiff(V);
    b.applyPotentialDiff(V);
  }
}