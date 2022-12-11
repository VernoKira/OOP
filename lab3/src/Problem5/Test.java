package Problem5;
import java.util.*;

public class Test {
  public static void main(String[] args) {
    Chocolate c1 = new Chocolate(400, "Twix");
    Chocolate c2 = new Chocolate(200, "Snikers");
    Chocolate c3 = new Chocolate(150, "Mars");
    Chocolate [] Choco = new Chocolate[] {c1, c2 ,c3};
    Sort.BubbleSort(Choco);
    for(Chocolate e: Choco) {
      System.out.println(e);  
    }
    
  }
}